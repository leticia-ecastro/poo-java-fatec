public class Candidato extends Pessoa {
    private int idade;
        private int id;

    public int getId() {
    	return this.id;
    }
    public void setId(int id) {
    	this.id = id;
    }


    public Candidato(int id,String nome, int idade) {
        super(nome);
        this.id = id;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Candidato: " + getNome() + ", Idade: " + idade;
    }
}
