public class Animal {
    private String nome;
    private String especie;
    private Habitat habitat;

    public Animal(String nome, String especie, Habitat habitat) {
        this.nome = nome;
        this.especie = especie;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public Habitat getHabitat() {
        return habitat;
    }
}
