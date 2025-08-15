import java.util.HashMap;
import java.util.Map;

public abstract class Armazem {
    private Map<String, Object> inventario = new HashMap<>();

    public void adicionarAoInventario(String nome, Object valor) {
        inventario.put(nome, valor);
    }

    public Object obterDoInventario(String nome) {
        return inventario.get(nome);
    }
}
