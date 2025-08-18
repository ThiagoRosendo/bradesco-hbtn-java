public class FolhaPagamento {
    
    public static double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculadoraDeSalario){
        return calculadoraDeSalario.calcular(funcionario.getSalario());
    }
}
