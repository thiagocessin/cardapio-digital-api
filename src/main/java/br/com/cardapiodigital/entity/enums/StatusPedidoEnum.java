package br.com.cardapiodigital.entity.enums;

public enum StatusPedidoEnum {
    AGUARDANDO_RESTAURANTE("Aguardando confirmação do restaurante"),
    ACEITO("Pedido aceito"),
    EM_ROTA_ENTREGA("Em rota de entrega"),
    ENTREGUE("Pedido foi entregue");

    private String status;

    StatusPedidoEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
