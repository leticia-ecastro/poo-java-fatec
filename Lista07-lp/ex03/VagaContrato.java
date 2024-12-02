public class VagaContrato extends Vaga {
    private boolean contratoTemporario;

    public VagaContrato(int id,String descricao, double salario, boolean contratoTemporario) {
        super(id, descricao, salario);
        this.contratoTemporario = contratoTemporario;
    }

    public boolean isContratoTemporario() {
        return contratoTemporario;
    }

    @Override
    public String toString() {
        return "Vaga de Contrato: " + getDescricao() + ", Salário: " + getSalario() + ", Contrato Temporário: " + contratoTemporario;
    }
}
