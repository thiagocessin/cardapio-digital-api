package br.com.cardapiodigital.dto;


import br.com.cardapiodigital.entity.PedidoEntity;
import br.com.cardapiodigital.entity.enums.StatusPedidoEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class PedidoDTO {
    private Long codigoPedido;
    private UsuarioDTO solicitante;
    private StatusPedidoEnum status;
    private BigDecimal valorTotal;
    private BigDecimal valorTaxaEntrega;
    private LocalDateTime dataHoraPedido;

    public PedidoEntity toEntity() {
        PedidoEntity ent = new PedidoEntity();
        ent.setCodigoPedido(codigoPedido);
        ent.setDataHoraPedido(dataHoraPedido);
        ent.setSolicitante(solicitante.toEntity());
        ent.setStatus(status);
        ent.setValorTaxaEntrega(valorTaxaEntrega);
        ent.setValorTotal(valorTotal);
        return ent;
    }
}
