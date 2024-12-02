public class Fruta {
    private String nome;

    public Fruta() {
        setNome("Fruta");
    }

    public Fruta(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            /*
            IllegalArgumentException ex = new IllegalArgumentException("Nome inválido!"); //crio o objeto ex e a exceção
            throw ex; //lança a exceção ex
            */
            throw new IllegalArgumentException("Nome inválido! Nome da fruta não pode ser nulo!"); //Cria uma chamada anônima do objeto ex, sem precisar criar uma referência para a instância IllegalArgumentException
        }
        if (nome.length() < 3) {
            throw new IllegalArgumentException("Nome de fruta (\"" + nome + "\") inválido! Nome precisa ter pelo menos três caracteres!");
        }
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "[Fruta: " + nome + "]";
    }
}
