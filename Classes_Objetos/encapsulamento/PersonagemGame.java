package Classes_Objetos.encapsulamento;

public class PersonagemGame {
    private String nome;
    private int saudeAtual;

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setSaudeAtual (int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }
}