package Q5;

public class ContaSalario extends Conta {
    private int saquesRestantes;

    public ContaSalario(String titular, double saldo, int limiteSaques) {
        super(titular, saldo);
        this.saquesRestantes = limiteSaques;
    }

    @Override
    public boolean sacar(double valor) {
        if (saquesRestantes > 0 && super.sacar(valor)) {
            saquesRestantes--;
            return true;
        }
        return false;
    }

    @Override
    public String getTipo() {
        return "Conta Salário";
    }

    public int getSaquesRestantes() {
        return saquesRestantes;
    }
}
