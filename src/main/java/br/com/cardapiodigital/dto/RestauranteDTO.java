package br.com.cardapiodigital.dto;

import br.com.cardapiodigital.entity.RestauranteEntity;
import br.com.cardapiodigital.entity.enums.TipoRestauranteEnum;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class RestauranteDTO {

    private Long id;
    private String nome;
    private List<ProdutoCardapioDTO> produtosDisponiveis;
    private TipoRestauranteEnum tipoRestaurante;

    public RestauranteEntity toEntity() {
        RestauranteEntity ent = new RestauranteEntity();
        ent.setId(id);
        ent.setNome(nome);
        ent.setProdutosDisponiveis(
                produtosDisponiveis.stream().map(ProdutoCardapioDTO::toEntity).collect(Collectors.toList())
        );
        ent.setTipoRestaurante(tipoRestaurante);
        return ent;
    }
}
