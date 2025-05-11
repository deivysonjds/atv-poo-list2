package Q6;

public class SistemaPagamento {
    public boolean efetuarPagamento(MetodoPagamento metodo, double valor) {
        boolean sucesso = metodo.processarPagamento(valor);
        double taxa = metodo.calcularTaxa(valor);
        System.out.println("Taxa aplicada: R$" + taxa);
        return sucesso;
    }
}
