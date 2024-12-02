import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animais;

    public Zoo() {
        animais = new ArrayList<>();
    }

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome() + ", Espécie: " + animal.getEspecie() + ", Habitat: " + animal.getHabitat().getNome());
        }
    }

    public int quantidadeAnimais() {
        return animais.size();
    }

    public int quantidadeAnimaisTipo(Class<?> tipoAnimal) {
        int quantidade = 0;
        for (Animal animal : animais) {
            if (tipoAnimal.isInstance(animal)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int quantidadeAnimaisPorHabitat(String nomeHabitat) {
        int quantidade = 0;
        for (Animal animal : animais) {
            if (animal.getHabitat().getNome().equalsIgnoreCase(nomeHabitat)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public double areaTotalAnimais() {
        double areaTotal = 0;
        for (Animal animal : animais) {
            areaTotal += animal.getHabitat().getArea();
        }
        return areaTotal;
    }
}
