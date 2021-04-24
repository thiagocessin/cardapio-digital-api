package br.com.cardapiodigital.service.impl;

import br.com.cardapiodigital.dto.PedidoDTO;
import br.com.cardapiodigital.entity.PedidoEntity;
import br.com.cardapiodigital.repository.PedidoRepository;
import br.com.cardapiodigital.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoServiceImpl implements PedidoService {

    private PedidoRepository pedidoRepository;

    @Autowired
    public PedidoServiceImpl(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }


    @Override
    public PedidoDTO saveOrUpdate(PedidoDTO pedido) {
        return this.pedidoRepository.save(pedido.toEntity()).toDto();
    }

    @Override
    public List<PedidoDTO> findAllBySolicitante(Long idSolicitante) {
        return this.pedidoRepository.findBySolicitanteId(idSolicitante)
                .stream().map(PedidoEntity::toDto).collect(Collectors.toList());
    }
}
