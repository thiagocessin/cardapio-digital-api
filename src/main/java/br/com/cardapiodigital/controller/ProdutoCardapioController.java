package br.com.cardapiodigital.controller;

import br.com.cardapiodigital.dto.ProdutoCardapioDTO;
import br.com.cardapiodigital.service.ProdutoCardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurantes/produtos")
public class ProdutoCardapioController {

    private ProdutoCardapioService produtoCardapioService;

    @Autowired
    public ProdutoCardapioController(ProdutoCardapioService produtoCardapioService) {
        this.produtoCardapioService = produtoCardapioService;
    }

    @PostMapping
    public ResponseEntity<ProdutoCardapioDTO> create(@RequestBody ProdutoCardapioDTO produto) {
        return ResponseEntity.status(201).body(this.produtoCardapioService.saveOrUpdate(produto));
    }

    @GetMapping("{idRestaurante}")
    public ResponseEntity<List<ProdutoCardapioDTO>> findAllByRestaurante(@PathVariable("idRestaurante") Long idRestaurante) {
        return ResponseEntity.ok(this.produtoCardapioService.findByRestauranteResponsavel(idRestaurante));
    }
    
    @GetMapping
    public ResponseEntity<List<ProdutoCardapioDTO>> findAll() {
        return ResponseEntity.ok(this.produtoCardapioService.findAll());
    }
    
    
  
}
