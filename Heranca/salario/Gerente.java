package Heranca.salario;

public class Gerente extends Empregado {

    private double salarioFixo;

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularSalarioTotal(Departamento departamento) {
        return this.salarioFixo + calcularBonus(departamento);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            double diferanca = departamento.getValorAtingidoMeta() - departamento.getValorAtingidoMeta();
            if (diferanca < 0){
                diferanca = 0;
            }
            return this.salarioFixo * 0.2 + diferanca * 0.01;
        }
        return 0;
    }
    
}
