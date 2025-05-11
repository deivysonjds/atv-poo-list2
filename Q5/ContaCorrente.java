package Q5;

public class ContaCorrente extends Conta {
    private double taxaOperacao;

    public ContaCorrente(String titular, double saldo, double taxaOperacao) {
        super(titular, saldo);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public boolean sacar(double valor) {
        double total = valor + taxaOperacao;
        return super.sacar(total);
    }

    @Override
    public String getTipo() {
        return "Conta Corrente";
    }
}

