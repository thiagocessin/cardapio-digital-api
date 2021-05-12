package br.com.cardapiodigital.service;

import br.com.cardapiodigital.dto.ProdutoCardapioDTO;

import java.util.List;

public interface ProdutoCardapioService {
    ProdutoCardapioDTO saveOrUpdate(ProdutoCardapioDTO produtoCardapio);
    List<ProdutoCardapioDTO> findByRestauranteResponsavel(Long idRestaurante);
    List<ProdutoCardapioDTO> findAll();
}
