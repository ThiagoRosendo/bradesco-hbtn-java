public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularSalarioTotal(Departamento departamento) {
        return super.getSalarioFixo() + this.calcularBonus(departamento);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            double diferanca = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            if (diferanca < 0){
                diferanca = 0;
            }
            return (super.getSalarioFixo() * 0.2) + (diferanca * 0.01);
        }
        return 0;
    }
    
}
