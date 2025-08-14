import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {
    private List<T> lista;

    public Biblioteca() {
        this.lista = new ArrayList<>();
    }

    public void adicionarMidia(T elemento){
        this.lista.add(elemento);
    }

    public List<T> obterListaMidias(){
        return lista;
    }
}
