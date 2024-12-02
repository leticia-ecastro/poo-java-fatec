import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Midia midia1 = new Midia(1, "CD Musical", "CD", "Música", 10.0);
        Filme filme1 = new Filme(2, "Filme A", "DVD", "Ação", 15.0, "Livre", 120);
        Livro livro1 = new Livro(3, "Livro B", "Brochura", "Romance", 8.0, "Autor X", "Editora Y", 1);
        Jogo jogo1 = new Jogo(4, "Jogo C", "Cartucho", "Aventura", 20.0, "Console Z");

        Cliente cliente1 = new Cliente(1, "João", 25);

        Aluguel[] alugueis = new Aluguel[10];
        int indiceAlugueis = 0;
        double totalRecebido = 0.0;

        boolean executando = true;
        while (executando) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Alugar mídia");
            System.out.println("2. Devolver mídia");
            System.out.println("3. Encerrar programa");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Mídias disponíveis para aluguel:");
                    System.out.println("1. " + midia1.getDescricao());
                    System.out.println("2. " + filme1.getDescricao());
                    System.out.println("3. " + livro1.getDescricao());
                    System.out.println("4. " + jogo1.getDescricao());

                    System.out.println("Escolha o número da mídia que deseja alugar:");
                    int escolha = scanner.nextInt();

                    Midia midiaEscolhida = null;

                    switch (escolha) {
                        case 1:
                            midiaEscolhida = midia1;
                            break;
                        case 2:
                            midiaEscolhida = filme1;
                            break;
                        case 3:
                            midiaEscolhida = livro1;
                            break;
                        case 4:
                            midiaEscolhida = jogo1;
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }

                    if (midiaEscolhida != null) {
                        Aluguel aluguel = new Aluguel(cliente1, midiaEscolhida);

                        alugueis[indiceAlugueis] = aluguel;
                        indiceAlugueis++;
                        totalRecebido += aluguel.calcularValor();

                        System.out.println("Aluguel realizado com sucesso!");
                    }

                    break;
                case 2:
                    if (indiceAlugueis > 0) {
                        System.out.println("Aluguéis em andamento:");
                        for (int i = 0; i < indiceAlugueis; i++) {
                            Aluguel aluguel = alugueis[i];
                            System.out.println((i + 1) + ". " + aluguel.getMidia().getDescricao());
                        }

                        System.out.println("Escolha o número do aluguel que deseja devolver:");
                        int escolhaDevolver = scanner.nextInt();

                        if (escolhaDevolver >= 1 && escolhaDevolver <= indiceAlugueis) {
                            Aluguel aluguelDevolver = alugueis[escolhaDevolver - 1];

                            for (int i = escolhaDevolver - 1; i < indiceAlugueis - 1; i++) {
                                alugueis[i] = alugueis[i + 1];
                            }
                            indiceAlugueis--;
                            totalRecebido -= aluguelDevolver.calcularValor();

                            System.out.println("Devolução realizada com sucesso!");
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    } else {
                        System.out.println("Não há aluguéis em andamento.");
                    }

                    break;
                case 3:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        System.out.println("Total recebido: R$" + totalRecebido);

        scanner.close();
    }
}
