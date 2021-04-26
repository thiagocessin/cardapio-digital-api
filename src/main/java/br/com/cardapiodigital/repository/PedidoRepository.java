package br.com.cardapiodigital.repository;

import br.com.cardapiodigital.entity.PedidoEntity;
import br.com.cardapiodigital.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity, Long>  {
    List<PedidoEntity> findBySolicitanteId(Long idSolicitante);
}
