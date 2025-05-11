package Q3;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(new Gerente("Carlos", 5000, 1500));
        empresa.adicionarFuncionario(new Desenvolvedor("Ana", 4000, 1.2));
        empresa.adicionarFuncionario(new Estagiario("Pedro", 1200));

        empresa.calcularFolhaDePagamento();
    }
}
