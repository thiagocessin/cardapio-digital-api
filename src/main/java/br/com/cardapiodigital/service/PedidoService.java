package br.com.cardapiodigital.service;

import java.util.List;

import br.com.cardapiodigital.dto.PedidoDTO;

public interface PedidoService {
    PedidoDTO saveOrUpdate(PedidoDTO pedido);
    List<PedidoDTO> findAllBySolicitante(Long idSolicitante);
    List<PedidoDTO> findAll();
}
