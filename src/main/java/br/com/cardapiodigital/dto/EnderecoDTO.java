package br.com.cardapiodigital.dto;

import br.com.cardapiodigital.entity.EnderecoEntity;
import lombok.Data;

@Data
public class EnderecoDTO {
    private String logradouro;
    private Long numero;
    private String cidade;
    private String bairro;
    private String UF;
    private String complemento;

    public EnderecoEntity toEntity() {
        EnderecoEntity ent = new EnderecoEntity();
        ent.setLogradouro(logradouro);
        ent.setBairro(bairro);
        ent.setCidade(cidade);
        ent.setComplemento(complemento);
        ent.setNumero(numero);
        ent.setUF(UF);

        return ent;
    }
}
