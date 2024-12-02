public class Paes extends Produto {
    private String tipo;

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Paes(String nome, double preco, int quantidade, String tipo) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "[Paes: " + getNome() + ", Tipo: " + tipo + "]";
    }
}
