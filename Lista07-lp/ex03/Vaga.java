public abstract class Vaga {
    private int id;
    private String descricao;
    private double salario;

    public Vaga(int id, String descricao, double salario) {
        this.id = id;
        this.descricao = descricao;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getSalario() {
        return salario;
    }
}
