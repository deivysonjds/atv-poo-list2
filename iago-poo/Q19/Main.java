package Q19;

public class Main {
    public static void main(String[] args) {
        MembroEquipe alice = new MembroEquipe("Alice", new Desenvolvedor());
        MembroEquipe bruno = new MembroEquipe("Bruno", new Designer());
        MembroEquipe carla = new MembroEquipe("Carla", new Testador());

        alice.adicionarTarefa(new Desenvolvimento("API de Login"));
        bruno.adicionarTarefa(new Design("Wireframe do site"));
        carla.adicionarTarefa(new Teste("Teste de integração"));

        System.out.println(alice.listarTarefas());
        System.out.println(bruno.listarTarefas());
        System.out.println(carla.listarTarefas());
    }
}
