package br.com.cardapiodigital.controller;

import br.com.cardapiodigital.dto.UsuarioDTO;
import br.com.cardapiodigital.entity.UsuarioEntity;
import br.com.cardapiodigital.service.UsuarioService;

import java.util.List;

import org.dom4j.util.UserDataElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> create(@RequestBody UsuarioDTO usuario) {
        return ResponseEntity.status(201).body(this.usuarioService.saveOrUpdate(usuario));
    }
    
    
    @GetMapping("{id}")
    public ResponseEntity<List<UsuarioDTO>> findAllById(@PathVariable("id") Long id){
    	return ResponseEntity.status(200).body(this.usuarioService.findAllById(id));
    }
    
    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> findAll(){
    	return ResponseEntity.status(200).body(this.usuarioService.findAll());
    }
    
    @GetMapping("/checkUserIsLogged/{userName}")
    public ResponseEntity<List<UsuarioDTO>> checkUserIsLogged(@PathVariable("userName") String userName){
    	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	
    	if(principal instanceof UserDetails) {
    		UserDetails userDetails = (UserDetails)principal;
    		
			if (userDetails.getUsername().equals(userName) && userDetails.isAccountNonExpired()
					&& userDetails.isAccountNonLocked() && userDetails.isCredentialsNonExpired()) {

 				return ResponseEntity.status(204).build();

			} 
    		
    	}
    	return ResponseEntity.status(404).build();
    }
}
