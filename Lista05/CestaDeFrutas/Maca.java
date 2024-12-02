public class Maca extends Fruta {
    private String cor;

    public Maca(String nome, String cor) {
        super(nome);
        setCor(cor);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if(cor == null) {
            throw new IllegalArgumentException("Cor inválido! Cor da maçã não pode ser nula!"); //Cria uma chamada anônima do objeto ex, sem precisar criar uma referência para a instância IllegalArgumentException
        }
        if (!cor.equalsIgnoreCase("vermelha") && !cor.equalsIgnoreCase("verde") && !cor.equalsIgnoreCase("amarela")) {
            throw new IllegalArgumentException("Cor (\"" + cor + "\") inválida! Maçã só pode ser \'vermelha\', \'verde\' ou \'amarela\'.");
        }
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "[Maçã: " + getNome() + ", Cor: " + cor + "]";
    }
}
