import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> criterioFiltro) {
        List<Produto> produtosFiltrados = new ArrayList<Produto>();
        for (Produto produto : produtos) {
            if (criterioFiltro.test(produto)) {
                produtosFiltrados.add(produto);
            }
        }
        return produtosFiltrados;
    }
}
