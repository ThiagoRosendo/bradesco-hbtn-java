import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

public class Livro {
    
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException{
        if (!autor.trim().contains(" ")) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        
        if (titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }

        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
