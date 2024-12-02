public class Jogo extends Midia {
    private String console;

    public Jogo(int codigo, String descricao, String tipo, String genero, double valor, String console) {
        super(codigo, descricao, tipo, genero, valor);
        this.console = console;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}
