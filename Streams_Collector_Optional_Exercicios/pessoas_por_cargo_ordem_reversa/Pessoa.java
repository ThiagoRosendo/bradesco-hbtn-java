import java.util.Locale;

public class Pessoa implements Comparable<Pessoa> {
    
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario){
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public String toString(){
        String salarioFormatado = String.format(new Locale("pt", "BR"), "%f", salario);
        return String.format("[%d] %s %s %d R$ %s", codigo, nome, cargo, idade, salarioFormatado);
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        if (pessoa == null) return 1;
        return this.nome.compareToIgnoreCase(pessoa.nome);
    }
}
