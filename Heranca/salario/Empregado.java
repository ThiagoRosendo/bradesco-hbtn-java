public class Empregado {
    
    private double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return this.salarioFixo + calcularBonus(departamento);
    }

    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            return this.salarioFixo * 0.1;
        }
        return 0;
    }
}
