package br.com.cardapiodigital.controller;

import br.com.cardapiodigital.dto.RestauranteDTO;
import br.com.cardapiodigital.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


}
