import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    protected String numeracao;
    protected double saldo;
    protected double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual){
        this.numeracao = numeracao;
        this.saldo = 0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException{
        if (valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException{
        if (valor <= 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }

        if (getSaldo() - valor < 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }

        this.saldo -= valor;
    }

    public double calcularTarifaMensal() {
        double valor = getSaldo() * 0.1;
        return valor < 10 ? valor : 10;
    }

    public double calcularJurosMensal() {
        double jurosMensal = taxaJurosAnual / 12;
        return getSaldo() > 0 ? getSaldo() * (jurosMensal / 100) : 0;
    }

    public void aplicarAtualizacaoMensal() {
        double tarifa = calcularTarifaMensal();
        double juros = calcularJurosMensal();
        this.saldo = getSaldo() + juros - tarifa;
    }
}
