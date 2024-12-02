public class Aluno extends Pessoa {
    private String curso;
    private double mensalidade;

    public Aluno(String nome, int idade, String curso, double mensalidade) {
        super(nome, idade);
        this.curso = curso;
        this.mensalidade = mensalidade;
    }

    // getters e setters

    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso + ", Mensalidade: " + mensalidade;
    }
}
