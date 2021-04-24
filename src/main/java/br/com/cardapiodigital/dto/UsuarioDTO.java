package br.com.cardapiodigital.dto;

import br.com.cardapiodigital.entity.UsuarioEntity;
import lombok.Data;

@Data
public class UsuarioDTO {

    private Long id;
    private String email;
    private String senha;
    private EnderecoDTO endereco;

    public UsuarioEntity toEntity() {
        UsuarioEntity ent = new UsuarioEntity();
        ent.setId(id);
        ent.setEndereco(endereco.toEntity());
        ent.setSenha(senha);
        ent.setEmail(email);
        return ent;
    }
}
