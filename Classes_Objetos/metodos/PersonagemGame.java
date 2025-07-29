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
        return this.nome;
    }

    public int getSaudeAtual() {
        return this.saudeAtual;
    }

    public void tomarDano (int quantidadeDeDano) {
        this.saudeAtual -= quantidadeDeDano;
        if (this.saudeAtual < 0 ){
            this.saudeAtual = 0;
        }
    }

    public void recebeCura (int quantidadeDeCura) {
        this.saudeAtual -= quantidadeDeCura;
        if (this.saudeAtual > 100 ){
            this.saudeAtual = 100;
        }
    }
    
}