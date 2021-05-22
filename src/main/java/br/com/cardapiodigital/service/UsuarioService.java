package br.com.cardapiodigital.service;

import java.util.List;

import br.com.cardapiodigital.dto.UsuarioDTO;
import br.com.cardapiodigital.entity.UsuarioEntity;

public interface UsuarioService {
    UsuarioDTO saveOrUpdate(UsuarioDTO u);
    public List<UsuarioDTO> findAll();
    public List<UsuarioDTO> findAllById(Long id);
}
