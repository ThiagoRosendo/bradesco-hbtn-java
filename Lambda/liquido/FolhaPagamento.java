public class FolhaPagamento {
    
    public static double calcularLiquido(Funcionario funcionario, CalculadoraDeSalario calculadoraDeSalario){
        return calculadoraDeSalario.calcular(funcionario.getSalario());
    }
}
