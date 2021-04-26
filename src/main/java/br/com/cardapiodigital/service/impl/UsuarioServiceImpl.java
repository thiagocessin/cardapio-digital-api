package br.com.cardapiodigital.service.impl;

import br.com.cardapiodigital.dto.UsuarioDTO;
import br.com.cardapiodigital.repository.UsuarioRepository;
import br.com.cardapiodigital.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioDTO saveOrUpdate(UsuarioDTO u) {
        return this.usuarioRepository.save(u.toEntity()).toDto();
    }
}
