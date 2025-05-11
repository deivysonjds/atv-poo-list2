package Q6;

public class Boleto extends MetodoPagamento {
    public Boleto() {
        super(0.0);
    }

    @Override
    public boolean processarPagamento(double valor) {
        double taxaFixa = 5.0;
        System.out.println("Pagamento com boleto processado com taxa fixa de R$" + taxaFixa);
        return true;
    }
}
