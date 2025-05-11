package Q5;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void adicionarRendimento() {
        saldo += saldo * taxaRendimento;
    }

    @Override
    public String getTipo() {
        return "Conta Poupança";
    }
}
