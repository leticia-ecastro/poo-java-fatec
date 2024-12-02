public class Terrestre extends Animal {
    private int quantidadePatas;

    public Terrestre(String nome, String especie, Habitat habitat, int quantidadePatas) {
        super(nome, especie, habitat);
        this.quantidadePatas = quantidadePatas;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }
}

