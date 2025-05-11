package Q6;

public class CartaoCredito extends MetodoPagamento {
    public CartaoCredito(double taxa) {
        super(taxa);
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (taxa < 0.02) {
            System.out.println("Pagamento com cartão de crédito aprovado!");
            return true;
        }
        System.out.println("Taxa muito alta para cartão de crédito. Pagamento recusado.");
        return false;
    }
}
