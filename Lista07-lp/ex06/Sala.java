import java.util.ArrayList;
import java.util.List;

public class Sala {
    private String nome;
    private List<Aluno> alunos;
    

    public Sala(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    // getters e setters

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    @Override
    public String toString() {
        StringBuilder alunosStr = new StringBuilder();
        for (Aluno aluno : alunos) {
            alunosStr.append(aluno.toString()).append("\n");
        }
        return "Sala: " + nome + "\nProfessor: " + professor.toString() + "\nAlunos:\n" + alunosStr.toString();
    }
}
