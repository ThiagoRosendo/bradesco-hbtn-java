public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador){
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getEstahFeita() {
        if (estahFeita) {
            return "X";
        }
        return " ";
    }    

    public void setEstahFeita(boolean estahfeita) {
        this.estahFeita = estahfeita;
    }

    public void modificarDescircao(String descricao){
        if (descricao.equals(" ") || descricao == null) {
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        } else {
            this.descricao = descricao;
        }
    }
}
