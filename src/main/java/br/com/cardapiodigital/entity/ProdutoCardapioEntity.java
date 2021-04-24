package br.com.cardapiodigital.entity;

import br.com.cardapiodigital.dto.ProdutoCardapioDTO;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class ProdutoCardapioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "restaurante_id")
    private Long restauranteResponsavel;

    private String nome;

    private BigDecimal valor;

    public ProdutoCardapioDTO toDto() {
        ProdutoCardapioDTO dto = new ProdutoCardapioDTO();
        dto.setId(id);
        dto.setNome(nome);
        dto.setValor(valor);
        dto.setRestauranteResponsavel(restauranteResponsavel);
        return dto;
    }
}
