package state;

public class PedidoPago implements EstadoPedido {
    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido pago. Preparando para envio.");
        pedido.setEstado(new PedidoEnviado());
    }
}
