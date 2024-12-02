public class Habitat {
    private String nome;
    private String localizacao;
    private double comprimento;
    private double largura;

    public Habitat(String nome, String localizacao, double comprimento, double largura) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getArea() {
        return comprimento * largura;
    }
}

