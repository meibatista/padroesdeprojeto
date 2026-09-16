package state;

public class PedidoEnviado implements EstadoPedido {
    @Override
    public void processar(Pedido pedido) {
        System.out.println("Pedido enviado. Não há mais ações.");
    }
}
