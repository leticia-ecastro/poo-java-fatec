import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();
        usaZoo usaZoo = new usaZoo();
        int opcao = 0;
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Cadastrar animal");
            System.out.println("2. Listar animais");
            System.out.println("3. Quantidade de animais no Zoo");
            System.out.println("4. Quantidade de animais de cada tipo");
            System.out.println("5. Quantidade de animais por tipo de habitat");
            System.out.println("6. Área total que os animais ocupam");
            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    usaZoo.cadastrarAnimal(scanner, zoo);
                    break;
                case 2:
                    usaZoo.listarAnimais(zoo);
                    break;
                case 3:
                    usaZoo.quantidadeAnimais(zoo);
                    break;
                case 4:
                    usaZoo.quantidadeAnimaisPorTipo(scanner, zoo);
                    break;
                case 5:
                    usaZoo.quantidadeAnimaisPorHabitat(scanner, zoo);
                    break;
                case 6:
                    usaZoo.areaTotalAnimais(zoo);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    
}
