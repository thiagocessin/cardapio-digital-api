package br.com.cardapiodigital.service.impl;

import br.com.cardapiodigital.dto.UsuarioDTO;
import br.com.cardapiodigital.entity.UsuarioEntity;
import br.com.cardapiodigital.repository.UsuarioRepository;
import br.com.cardapiodigital.service.UsuarioService;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioDTO saveOrUpdate(UsuarioDTO u) {
        return this.usuarioRepository.save(u.toEntity()).toDto();
    }
    
    @Override
    public List<UsuarioDTO> findAll(){
    	 return this.usuarioRepository.findAll()
    			 .stream()
    			 .map(UsuarioEntity::toDto).collect(Collectors.toList());
    }
    
    @Override
    public List<UsuarioDTO> findAllById(Long id) {
    	 return this.usuarioRepository.findAllById(Arrays.asList(id))
    			 .stream()
    			 .map(UsuarioEntity::toDto).collect(Collectors.toList());
    }
    
    
}
