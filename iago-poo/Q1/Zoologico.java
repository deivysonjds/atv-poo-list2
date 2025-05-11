package Q1;
public class Zoologico {

    private Animal[] animais;

    public Zoologico() {
        animais = new Animal[2];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
    }

    public void fazerAnimaisEmitiremSom() {
        for (Animal animal : animais) {
            animal.som();
        }
    }
}
