import java.util.*;
import java.util.stream.Collectors;

public class Blog {
    private List<Post> postagens;
    
    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post novoPost) {
        boolean existe = postagens.stream()
                            .anyMatch(p -> p.toString().equals(novoPost.toString())
                            && p.getAutor().toString().equals(novoPost.getAutor().toString()));
        if (existe) {
            throw new IllegalArgumentException("Postagem jah existente");
        }
        postagens.add(novoPost);
    }

    public Set<Autor> obterTodosAutores(){
        return postagens.stream().map(Post::getAutor).collect(Collectors.toCollection(TreeSet::new));
    }

    public Map<Categorias, Integer> obterContagemPorCategoria(){
        Map<Categorias, Integer> contagem = new TreeMap<>();

        for (Post post : postagens){
            Categorias categoria = post.getCategoria();
            contagem.merge(categoria, 1, Integer::sum);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorAutor(Autor autor){
        return postagens.stream()
                    .filter(p -> p.getAutor().toString().equals(autor.toString()))
                    .collect(Collectors.toCollection(TreeSet::new));
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria){
        return postagens.stream()
                    .filter(p -> p.getCategoria() == categoria)
                    .collect(Collectors.toCollection(TreeSet::new));
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor(){
        return postagens.stream()
                    .collect(Collectors.groupingBy(Post::getAutor, TreeMap::new, Collectors.toCollection(TreeSet::new)));
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias(){
        return postagens.stream()
        .collect(Collectors.groupingBy(Post::getCategoria, TreeMap::new, Collectors.toCollection(TreeSet::new)));
    }
}
