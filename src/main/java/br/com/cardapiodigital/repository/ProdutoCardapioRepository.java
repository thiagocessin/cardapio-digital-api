package br.com.cardapiodigital.repository;

import br.com.cardapiodigital.entity.ProdutoCardapioEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoCardapioRepository extends CrudRepository<ProdutoCardapioEntity, Long> {
    List<ProdutoCardapioEntity> findByRestauranteResponsavel(Long idRestaurate);
}
