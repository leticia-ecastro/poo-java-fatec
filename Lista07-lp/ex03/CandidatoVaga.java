public class CandidatoVaga {
    private Candidato candidato;
    private Vaga vaga;

    public CandidatoVaga(Candidato candidato, Vaga vaga) {
        this.candidato = candidato;
        this.vaga = vaga;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public Vaga getVaga() {
        return vaga;
    }
}
