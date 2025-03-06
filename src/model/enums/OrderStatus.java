package model.enums;

public enum OrderStatus {
    PENDING_PAYMENT("Aguardando pagamento"),
    PROCESSING("Processando"),
    SHIPPING("Enviado"),
    DELIVERED("Entregue");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
