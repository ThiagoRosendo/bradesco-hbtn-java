public class Post implements Comparable<Post> {
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria){
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int compareTo(Post outroPost){
        return this.toString().compareToIgnoreCase(outroPost.toString());
    }
}
