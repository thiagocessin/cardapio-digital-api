package br.com.cardapiodigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cardapiodigital.dto.RestauranteDTO;
import br.com.cardapiodigital.service.RestauranteService;

@RestController
@RequestMapping("/api/v1/restaurantes")
public class RestauranteController {

    private RestauranteService restauranteService;

    @Autowired
    public RestauranteController(RestauranteService restauranteService) {
        this.restauranteService = restauranteService;
    }

    @PostMapping
    public ResponseEntity<RestauranteDTO> create(@RequestBody RestauranteDTO restaurante) {
        return ResponseEntity.status(201).body(this.restauranteService.saveOrUpdate(restaurante));
    }

    @GetMapping
    public ResponseEntity<List<RestauranteDTO>> findAll() {
        return ResponseEntity.ok(this.restauranteService.findAll());
    }

    
    @GetMapping("{tipoRestaurante}")
    public ResponseEntity<List<RestauranteDTO>> findAllByTipoRestaurante(
    		@PathVariable("tipoRestaurante") String tipoRestaurante){
    	return null;
    }

}
