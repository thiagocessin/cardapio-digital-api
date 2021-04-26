package br.com.cardapiodigital.entity;

import br.com.cardapiodigital.dto.EnderecoDTO;
import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class EnderecoEntity {
    private String logradouro;
    private Long numero;
    private String cidade;
    private String bairro;
    private String UF;
    private String complemento;

    public EnderecoDTO toDto() {
        EnderecoDTO dto = new EnderecoDTO();
        dto.setBairro(bairro);
        dto.setCidade(cidade);
        dto.setComplemento(complemento);
        dto.setLogradouro(logradouro);
        dto.setNumero(numero);
        dto.setUF(UF);
        return dto;
    }
}
