package Q6;

public class Pix extends MetodoPagamento {
    public Pix() {
        super(0.0);
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Pix aprovado instantaneamente!");
        return true;
    }
}
