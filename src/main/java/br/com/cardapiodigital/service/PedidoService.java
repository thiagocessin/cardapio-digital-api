package br.com.cardapiodigital.service;

import br.com.cardapiodigital.dto.PedidoDTO;

import java.util.List;

public interface PedidoService {
    PedidoDTO saveOrUpdate(PedidoDTO pedido);
    List<PedidoDTO> findAllBySolicitante(Long idSolicitante);
}
