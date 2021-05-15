package br.com.cardapiodigital.dto;

import br.com.cardapiodigital.entity.ProdutoCardapioEntity;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoCardapioDTO {

    private Long id;
    private Long restauranteResponsavel;
    private String nome;
    private BigDecimal valor;
    private String descricao;


    public ProdutoCardapioEntity toEntity() {
        ProdutoCardapioEntity ent = new ProdutoCardapioEntity();
        ent.setId(id);
        ent.setNome(nome);
        ent.setValor(valor);
        ent.setRestauranteResponsavel(restauranteResponsavel);
        ent.setDescricao(descricao);

        return ent;
    }

}
