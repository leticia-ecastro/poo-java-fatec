public class VagaEstagio extends Vaga {
    private int mesesEstagio;

    public VagaEstagio(int id,String descricao, double salario, int mesesEstagio) {
        super(id, descricao, salario);
        this.mesesEstagio = mesesEstagio;
    }

    public int getMesesEstagio() {
        return mesesEstagio;
    }

    @Override
    public String toString() {
        return "Vaga de Estágio: " + getDescricao() + ", Salário: " + getSalario() + ", Meses de Estágio: " + mesesEstagio;
    }
}
