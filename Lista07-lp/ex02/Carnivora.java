public class Carnivora extends Planta {
    private boolean venenosa;

    public Carnivora(String nome, boolean venenosa) {
        super(nome, "Carnívora");
        this.venenosa = venenosa;
    }

    public boolean isVenenosa() {
        return venenosa;
    }
}
