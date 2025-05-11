package Q5;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta c) {
        contas.add(c);
    }

    public void gerarRelatorio() {
        for (Conta c : contas) {
            System.out.println(c.titular + " - " + c.getTipo() + " - Saldo: R$" + c.getSaldo());
            if (c instanceof ContaSalario) {
                System.out.println("  Saques restantes: " + ((ContaSalario) c).getSaquesRestantes());
            }
        }
    }
}
