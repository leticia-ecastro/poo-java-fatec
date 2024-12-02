public class Professor extends Pessoa {
    private double salario;
    private String[] disciplinas;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
        this.disciplinas = new String[10];
    }

    // getters e setters

    public void setDisciplina(String disciplina) {
        for (int i = 0; i < this.disciplinas.length; i++) {
            if (this.disciplinas[i] == null) {
                this.disciplinas[i] = disciplina;
                return;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder disciplinasStr = new StringBuilder();
        for (String disciplina : disciplinas) {
            if (disciplina != null) {
                disciplinasStr.append(disciplina).append(", ");
            }
        }
        return super.toString() + ", Salário: " + salario + ", Disciplinas: " + disciplinasStr.toString();
    }
}
