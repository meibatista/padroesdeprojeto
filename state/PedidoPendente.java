package state;

public class PedidoPendente implements EstadoPedido {
    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido pendente. Aguardando pagamento.");
        pedido.setEstado(new PedidoPago());
    }
}
