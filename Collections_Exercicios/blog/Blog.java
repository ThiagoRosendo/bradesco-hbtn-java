import java.util.*;
import java.util.stream.Collectors;

public class Blog {
    private List<Post> postagens;
    
    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        this.postagens.add(post);
    }

    public Set<String> obterTodosAutores(){
        return postagens.stream().map(Post::getAutor).collect(Collectors.toSet());
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        Map<String, Integer> contagem = new TreeMap<>();

        for (Post post : postagens){
            String categoria = post.getCategoria();
            contagem.merge(categoria, 1, Integer::sum);
        }
        return contagem;
    }
}
