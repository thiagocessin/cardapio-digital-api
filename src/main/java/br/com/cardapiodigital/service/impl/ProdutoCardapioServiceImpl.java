package br.com.cardapiodigital.service.impl;

import br.com.cardapiodigital.dto.ProdutoCardapioDTO;
import br.com.cardapiodigital.entity.ProdutoCardapioEntity;
import br.com.cardapiodigital.repository.ProdutoCardapioRepository;
import br.com.cardapiodigital.service.ProdutoCardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ProdutoCardapioServiceImpl implements ProdutoCardapioService {

    private ProdutoCardapioRepository produtoCardapioRepository;

    @Autowired
    public ProdutoCardapioServiceImpl(ProdutoCardapioRepository produtoCardapioRepository) {
        this.produtoCardapioRepository = produtoCardapioRepository;
    }

    @Override
    public ProdutoCardapioDTO saveOrUpdate(ProdutoCardapioDTO produtoCardapio) {
        return this.produtoCardapioRepository.save(produtoCardapio.toEntity()).toDto();
    }

    @Override
    public List<ProdutoCardapioDTO> findByRestauranteResponsavel(Long idRestaurante) {
        return this.produtoCardapioRepository.findByRestauranteResponsavel(idRestaurante)
                .stream().map(ProdutoCardapioEntity::toDto).collect(Collectors.toList());
    }

	@Override
	public List<ProdutoCardapioDTO> findAll() {
		
		Spliterator<ProdutoCardapioEntity> spliterator = Spliterators
                .spliteratorUnknownSize(this.produtoCardapioRepository.findAll().iterator(), 0);
		
		return StreamSupport.stream(spliterator, false).map(ProdutoCardapioEntity::toDto).collect(Collectors.toList());
	}
}
