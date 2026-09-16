package state;

public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        estado = new PedidoPendente();
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void processar() {
        estado.processar(this);
    }
}
