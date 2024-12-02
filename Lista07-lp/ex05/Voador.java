public class Voador extends Animal {
    private String corPena;

    public Voador(String nome, String especie, Habitat habitat, String corPena) {
        super(nome, especie, habitat);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }
}

