package br.com.cardapiodigital.entity;

import br.com.cardapiodigital.dto.UsuarioDTO;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String senha;

    @Embedded
    private EnderecoEntity endereco;

    public UsuarioDTO toDto() {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setEndereco(endereco.toDto());
        dto.setEmail(email);
        dto.setId(id);
        dto.setSenha(senha);

        return dto;
    }
}
