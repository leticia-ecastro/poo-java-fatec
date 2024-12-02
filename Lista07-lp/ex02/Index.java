import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Floresta floresta = new Floresta();
        Scanner num = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("=== Menu ===");
            System.out.println("1- Cadastrar planta");
            System.out.println("2- Listar plantas");
            System.out.println("3- Mostrar quantidade total de plantas");
            System.out.println("4- Mostrar quantidade de plantas por tipo");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = num.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da planta: ");
                    String nome = num.next();
                    System.out.println("Selecione o tipo da planta:");
                    System.out.println("1. Árvore");
                    System.out.println("2. Flor");
                    System.out.println("3. Carnívora");
                    System.out.print("Escolha uma opção: ");
                    int tipo = num.nextInt();

                    Planta planta;
                    switch (tipo) {
                        case 1:
                            System.out.print("É frutífera? (S/N): ");
                            boolean frutifera = num.next().equalsIgnoreCase("S");
                            planta = new Arvore(nome, frutifera);
                            break;
                        case 2:
                            System.out.print("Digite a cor das flores: ");
                            String cor = num.next();
                            planta = new Flor(nome, cor);
                            break;
                        case 3:
                            System.out.print("É venenosa? (S/N): ");
                            boolean venenosa = num.next().equalsIgnoreCase("S");
                            planta = new Carnivora(nome, venenosa);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            continue;
                    }

                    floresta.cadastrarPlanta(planta);
                    System.out.println("Planta cadastrada com sucesso.");
                    break;

                case 2:
                    floresta.listarPlantas();
                    break;

                case 3:
                    System.out.println("Quantidade total de plantas: " + floresta.getQuantidadeTotalPlantas());
                    break;

                case 4:
                    System.out.println("Árvores: " + floresta.getQuantidadePlantasPorTipo("Árvore"));
                    System.out.println("Flores: " + floresta.getQuantidadePlantasPorTipo("Flor"));
                    System.out.println("Plantas Carnívoras: " + floresta.getQuantidadePlantasPorTipo("Carnívora"));
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        }
        num.close();
    }
}