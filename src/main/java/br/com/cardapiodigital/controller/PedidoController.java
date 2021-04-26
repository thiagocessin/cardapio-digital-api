package br.com.cardapiodigital.controller;

import br.com.cardapiodigital.dto.PedidoDTO;
import br.com.cardapiodigital.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {

    private PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<PedidoDTO> create(@RequestBody PedidoDTO pedido) {
        return ResponseEntity.status(201).body(this.pedidoService.saveOrUpdate(pedido));
    }

    @GetMapping("{idSolicitante}")
    public ResponseEntity<List<PedidoDTO>> findBySolicitante(@PathVariable("idSolicitante") Long idSolicitante) {
        return ResponseEntity.ok(this.pedidoService.findAllBySolicitante(idSolicitante));
    }

}
