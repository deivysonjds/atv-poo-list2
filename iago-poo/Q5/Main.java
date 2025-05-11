package Q5;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("João", 1000, 5);
        cc.sacar(100);

        ContaPoupanca cp = new ContaPoupanca("Maria", 2000, 0.03);
        cp.adicionarRendimento();

        ContaSalario cs = new ContaSalario("Carlos", 800, 2);
        cs.sacar(100);
        cs.sacar(100);
        cs.sacar(100);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(cs);

        banco.gerarRelatorio();
    }
}
