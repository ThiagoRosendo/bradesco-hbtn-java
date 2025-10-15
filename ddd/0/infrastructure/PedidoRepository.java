package infrastructure;

import java.util.HashMap;
import java.util.Map;
import domain.Pedido;

public class PedidoRepository {


    private final Map<String, Pedido> pedidos = new HashMap<>();


    public void salvar(Pedido pedido) {}


    public Pedido buscarPorId(String id) {
        pedidos.get(id);
    }
}