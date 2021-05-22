package br.com.cardapiodigital.entity;

import br.com.cardapiodigital.dto.RestauranteDTO;
import br.com.cardapiodigital.entity.enums.TipoRestauranteEnum;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity
public class RestauranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "restauranteResponsavel",
            targetEntity = ProdutoCardapioEntity.class,
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<ProdutoCardapioEntity> produtosDisponiveis;
    
    private TipoRestauranteEnum tipoRestaurante;

    public RestauranteDTO toDto() {
        RestauranteDTO dto = new RestauranteDTO();
        dto.setId(id);
        dto.setNome(nome);
        dto.setProdutosDisponiveis(
                produtosDisponiveis.stream().map(ProdutoCardapioEntity::toDto).collect(Collectors.toList())
        );
        dto.setTipoRestaurante(tipoRestaurante);
        return dto;
    }
}
