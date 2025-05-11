package Q4;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.adicionarProduto(new Computador("Notebook Dell", 4500));
        loja.adicionarProduto(new Smartphone("iPhone", 7000));
        loja.adicionarProduto(new Tablet("Samsung Galaxy Tab", 2500));

        loja.listarGarantias();
    }
}
