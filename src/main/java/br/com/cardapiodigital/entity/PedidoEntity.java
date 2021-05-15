package br.com.cardapiodigital.entity;

import br.com.cardapiodigital.dto.PedidoDTO;
import br.com.cardapiodigital.entity.enums.StatusPedidoEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoPedido;

    @ManyToOne
    private UsuarioEntity solicitante;

    private StatusPedidoEnum status;

    private BigDecimal valorTotal;

    private BigDecimal valorTaxaEntrega;

    private LocalDateTime dataHoraPedido;
    
    private String descricao;
    
    @OneToMany
    private List<ProdutoCardapioEntity> listaProdutos;

    public PedidoDTO toDto() {
        PedidoDTO dto = new PedidoDTO();
        dto.setCodigoPedido(codigoPedido);
        dto.setDataHoraPedido(dataHoraPedido);
        dto.setSolicitante(solicitante.toDto());
        dto.setStatus(status);
        dto.setValorTotal(valorTotal);
        dto.setValorTaxaEntrega(valorTaxaEntrega);
        dto.setDescricao(descricao);

        return dto;
    }
}
