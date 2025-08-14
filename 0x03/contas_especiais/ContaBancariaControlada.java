public class ContaBancariaControlada extends ContaBancariaBasica {

    private double saldoMinimo;
    private double valorPenalidade ;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade){
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public double getValorPenalidade() {
        return valorPenalidade;
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        double tarifa = calcularTarifaMensal();
        double juros = calcularJurosMensal();
        super.saldo = getSaldo() + juros - tarifa;
        if (getSaldo() < getSaldoMinimo()) {
            super.saldo = getSaldo() - valorPenalidade;
        }
    }
}
