package br.com.cardapiodigital.service.impl;

import br.com.cardapiodigital.dto.RestauranteDTO;
import br.com.cardapiodigital.entity.RestauranteEntity;
import br.com.cardapiodigital.repository.RestauranteRepository;
import br.com.cardapiodigital.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestauranteServiceImpl implements RestauranteService {

    private RestauranteRepository restauranteRepository;

    @Autowired
    public RestauranteServiceImpl(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    @Override
    public RestauranteDTO saveOrUpdate(RestauranteDTO restaurante) {
        return this.restauranteRepository.save(restaurante.toEntity()).toDto();
    }

    @Override
    public List<RestauranteDTO> findAll() {
        return this.restauranteRepository.findAll().stream().map(RestauranteEntity::toDto).collect(Collectors.toList());
    }

}
