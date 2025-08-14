public class Jornal extends Midia{
    
    private int quantidadedeArtigos;

    public Jornal(String nome, int quantidadedeArtigos){
        super(nome);
        this.quantidadedeArtigos = quantidadedeArtigos;
    }

    public int getQuantidadedeArtigos() {
        return quantidadedeArtigos;
    }
}
