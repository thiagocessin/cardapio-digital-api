package br.com.cardapiodigital.dto;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.cardapiodigital.entity.PedidoEntity;
import br.com.cardapiodigital.entity.ProdutoCardapioEntity;
import br.com.cardapiodigital.entity.enums.StatusPedidoEnum;
import lombok.Data;

@Data
public class PedidoDTO {
    private Long codigoPedido;
    private UsuarioDTO solicitante;
    private StatusPedidoEnum status;
    private BigDecimal valorTotal;
    private BigDecimal valorTaxaEntrega;
    private LocalDateTime dataHoraPedido;
    private List<ProdutoCardapioDTO> listaProdutos;
    private String descricao;
    
    public PedidoEntity toEntity() {
        PedidoEntity ent = new PedidoEntity();
        ent.setCodigoPedido(codigoPedido);
        ent.setDataHoraPedido(dataHoraPedido);
        ent.setSolicitante(solicitante.toEntity());
        ent.setStatus(status);
        ent.setValorTaxaEntrega(valorTaxaEntrega);
        ent.setValorTotal(valorTotal);
        if(this.listaProdutos != null) {
        	ent.setListaProdutos(listaDtoToEntity());
        }
        ent.setDescricao(descricao);
        return ent;
    }
    
    
    public List<ProdutoCardapioEntity> listaDtoToEntity(){
    	return this.listaProdutos
    		.stream()
    		.map(ProdutoCardapioDTO::toEntity)
    		.collect(Collectors.toList());
    	
    }
}
