import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class Pessoa implements Comparable<Pessoa> {
    
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;
    private List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies){
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies != null ? new ArrayList<>(hobbies) : new ArrayList<>();
    }

    @Override
    public String toString(){
        String salarioFormatado = String.format(new Locale("pt", "BR"), "%f", salario);
        return String.format("[%d] %s %s %d R$ %s", codigo, nome, cargo, idade, salarioFormatado);
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.codigo, pessoa.codigo);
    }
}
