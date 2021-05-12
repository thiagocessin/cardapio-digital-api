package br.com.cardapiodigital.repository;

import br.com.cardapiodigital.dto.UsuarioDTO;
import br.com.cardapiodigital.entity.UsuarioEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
	
}
