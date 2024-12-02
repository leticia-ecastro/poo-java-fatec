public class Aquatico extends Animal {
    private boolean respiraForaAgua;

    public Aquatico(String nome, String especie, Habitat habitat, boolean respiraForaAgua) {
        super(nome, especie, habitat);
        this.respiraForaAgua = respiraForaAgua;
    }

    public boolean isRespiraForaAgua() {
        return respiraForaAgua;
    }
}

