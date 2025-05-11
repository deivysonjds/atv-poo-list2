package Q6;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        MetodoPagamento cartao = new CartaoCredito(0.015);
        MetodoPagamento pix = new Pix();
        MetodoPagamento boleto = new Boleto();

        System.out.println("Pagamento 1:");
        sistema.efetuarPagamento(cartao, 1000);

        System.out.println("\nPagamento 2:");
        sistema.efetuarPagamento(pix, 500);

        System.out.println("\nPagamento 3:");
        sistema.efetuarPagamento(boleto, 800);
    }
}
