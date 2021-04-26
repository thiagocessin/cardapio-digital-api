package br.com.cardapiodigital.service;

import br.com.cardapiodigital.dto.RestauranteDTO;

import java.util.List;

public interface RestauranteService {
    RestauranteDTO saveOrUpdate(RestauranteDTO restaurante);

    List<RestauranteDTO> findAll();
}
