import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaRH {
    private List<Pessoa> pessoas;
    private List<Vaga> vagas;
    private List<CandidatoVaga> candidatosVagas;

    public EmpresaRH() {
        this.pessoas = new ArrayList<>();
        this.vagas = new ArrayList<>();
        this.candidatosVagas = new ArrayList<>();
    }

    public void cadastrarCandidato() {
        Scanner num = new Scanner(System.in);

        System.out.print("Nome do candidato: ");
        String nome = num.nextLine();

        System.out.print("Idade do candidato: ");
        int idade = num.nextInt();
        num.nextLine();
        int id = vagas.size() + 1;
        Candidato candidato = new Candidato(id, nome, idade);
        pessoas.add(candidato);

        System.out.println("Candidato cadastrado com sucesso!");
        System.out.println();
    }

    public void cadastrarVaga() {
        Scanner num = new Scanner(System.in);

        System.out.print("Descrição da vaga: ");
        String descricao = num.nextLine();

        System.out.print("Salário oferecido: ");
        double salario = num.nextDouble();
        num.nextLine();

        System.out.print("Tipo de vaga (1 - Estágio, 2 - Contrato): ");
        int tipoVaga = num.nextInt();
        num.nextLine();

        int id = vagas.size() + 1;

        Vaga vaga;
        if (tipoVaga == 1) {
            System.out.print("Meses de estágio: ");
            int mesesEstagio = num.nextInt();
            num.nextLine();
            vaga = new VagaEstagio(id, descricao, salario, mesesEstagio);
        } else {
            System.out.print("Contrato temporário (true/false): ");
            boolean contratoTemporario = num.nextBoolean();
            num.nextLine();
            vaga = new VagaContrato(id, descricao, salario, contratoTemporario);
        }

        vagas.add(vaga);

        System.out.println("Vaga cadastrada com sucesso!");
        System.out.println();
    }

    public void exibirCandidatos() {
        System.out.println("+--------------------+");
        System.out.println("      Candidatos      ");
        System.out.println("+--------------------+");
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Candidato) {
                Candidato candidato = (Candidato) pessoa;
                System.out.println("Nome: " + candidato.getNome());
                System.out.println("Idade: " + candidato.getIdade());
                System.out.println("Id: " + candidato.getId());
                System.out.println("--------------------");
            }
        }
        System.out.println();
    }

    public void exibirVagas() {
        System.out.println("+--------------------+");
        System.out.println("         Vagas        ");
        System.out.println("+--------------------+");
        for (Vaga vaga : vagas) {
            System.out.println("Descrição: " + vaga.getDescricao());
            System.out.println("Salário: " + vaga.getSalario());
            System.out.println("Id: " + vaga.getId());
            if (vaga instanceof VagaEstagio) {
                System.out.println("Tipo: Estágio");
            } else if (vaga instanceof VagaContrato) {
                System.out.println("Tipo: Contrato Temporário");
            }
            System.out.println("--------------------");
        }
        System.out.println();
    }

    public void exibirCandidatoVaga() {
        System.out.println("+--------------------+");
        System.out.println("   Candidato Vagas    ");
        System.out.println("+--------------------+");
        for (CandidatoVaga candidatoVaga : candidatosVagas) {
            System.out.println("Candidato: " + candidatoVaga.getCandidato());
            System.out.println("Vaga: " + candidatoVaga.getVaga());
            System.out.println("--------------------");
        }
        System.out.println();
    }

    public void cadastrarCandidatoVaga() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vagas disponíveis:");
        exibirVagas();

        System.out.print("ID da vaga: ");
        int idVaga = scanner.nextInt();
        scanner.nextLine();

        Vaga vaga = getVagaById(idVaga);

        if (vaga == null) {
            System.out.println("Vaga não encontrada!");
        } else {
            System.out.println("Candidatos disponíveis:");
            exibirCandidatos();

            System.out.print("ID do candidato: ");
            int idCandidato = scanner.nextInt();
            scanner.nextLine();

            Candidato candidato = getCandidatoById(idCandidato);

            if (candidato == null) {
                System.out.println("Candidato não encontrado!");
            } else {
                CandidatoVaga candidatoVaga = new CandidatoVaga(candidato, vaga);
                candidatosVagas.add(candidatoVaga);

                System.out.println("Candidato cadastrado na vaga com sucesso!");
            }
        }

        System.out.println();
    }

    private Vaga getVagaById(int idVaga) {
        for (Vaga vaga : vagas) {
            if (vaga.getId() == idVaga) {
                return vaga;
            }
        }
        return null;
    }

    private Candidato getCandidatoById(int idCandidato) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Candidato) {
                Candidato candidato = (Candidato) pessoa;
                if (candidato.getId() == idCandidato) {
                    return candidato;
                }
            }
        }
        return null;
    }
}
