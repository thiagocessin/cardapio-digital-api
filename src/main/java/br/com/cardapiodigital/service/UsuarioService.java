package br.com.cardapiodigital.service;

import br.com.cardapiodigital.dto.UsuarioDTO;
import br.com.cardapiodigital.entity.UsuarioEntity;

public interface UsuarioService {
    UsuarioDTO saveOrUpdate(UsuarioDTO u);
}
