import java.util.*;
import java.util.stream.Collectors;

public class Blog {
    List<Post> lista;
    
    public Blog() {
        this.lista = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        this.lista.add(post);
    }

    public Set<String> obterTodosAutores(){
        return lista.stream().map(Post::getAutor).collect(Collectors.toSet());
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> contagem = new TreeMap<>();

        for (Post post : lista){
            String categoria = post.getCategoria();
            contagem.merge(categoria, 1, Integer::sum);
        }
        return contagem;
    }
}
