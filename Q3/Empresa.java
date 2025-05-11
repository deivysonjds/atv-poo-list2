package Q3;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void calcularFolhaDePagamento() {
        for (Funcionario f : funcionarios) {
            System.out.println(f.nome + " - Salário: R$" + f.calcularSalario());
        }
    }
}
