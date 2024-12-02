import java.util.Scanner;

public class usaZoo {
    public void cadastrarAnimal(Scanner scanner, Zoo zoo) {
        System.out.println("\n----- Cadastrar Animal -----");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Espécie: ");
        String especie = scanner.next();
        System.out.print("Habitat (jaula, gaiola, aquário, lago ou viveiro): ");
        String nomeHabitat = scanner.next();

        System.out.println("Selecione o tipo de animal:");
        System.out.println("1. Voador");
        System.out.println("2. Terrestre");
        System.out.println("3. Aquático");
        System.out.print("Opção: ");
        int tipoAnimal = scanner.nextInt();

        Habitat habitat = criarHabitat(nomeHabitat);
        Animal animal;

        switch (tipoAnimal) {
            case 1:
                System.out.print("Cor da pena: ");
                String corPena = scanner.next();
                animal = new Voador(nome, especie, habitat, corPena);
                break;
            case 2:
                System.out.print("Quantidade de patas: ");
                int quantidadePatas = scanner.nextInt();
                animal = new Terrestre(nome, especie, habitat, quantidadePatas);
                break;
            case 3:
                System.out.print("Respira fora da água? (true/false): ");
                boolean respiraForaAgua = scanner.nextBoolean();
                animal = new Aquatico(nome, especie, habitat, respiraForaAgua);
                break;
            default:
                System.out.println("Tipo de animal inválido! Animal não cadastrado.");
                return;
        }

        zoo.cadastrarAnimal(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    public  void listarAnimais(Zoo zoo) {
        System.out.println("\n----- Listar Animais -----");
        zoo.listarAnimais();
    }

    public  void quantidadeAnimais(Zoo zoo) {
        System.out.println("\n----- Quantidade de Animais no Zoo -----");
        System.out.println("Total: " + zoo.quantidadeAnimais());
    }

    public  void quantidadeAnimaisPorTipo(Scanner scanner, Zoo zoo) {
        System.out.println("\n----- Quantidade de Animais por Tipo -----");
        System.out.println("Selecione o tipo de animal:");
        System.out.println("1. Voador");
        System.out.println("2. Terrestre");
        System.out.println("3. Aquático");
        System.out.print("Opção: ");
        int tipoAnimal = scanner.nextInt();

        Class<?> tipoClasse;
        switch (tipoAnimal) {
            case 1:
                tipoClasse = Voador.class;
                break;
            case 2:
                tipoClasse = Terrestre.class;
                break;
            case 3:
                tipoClasse = Aquatico.class;
                break;
            default:
                System.out.println("Tipo de animal inválido!");
                return;
        }

        System.out.println("Quantidade: " + zoo.quantidadeAnimaisTipo(tipoClasse));
    }

    public  void quantidadeAnimaisPorHabitat(Scanner scanner, Zoo zoo) {
        System.out.println("\n----- Quantidade de Animais por Tipo de Habitat -----");
        System.out.print("Habitat (jaula, gaiola, aquário, lago ou viveiro): ");
        String nomeHabitat = scanner.next();

        System.out.println("Quantidade: " + zoo.quantidadeAnimaisPorHabitat(nomeHabitat));
    }

    public  void areaTotalAnimais(Zoo zoo) {
        System.out.println("\n----- Área Total que os Animais Ocupam -----");
        System.out.println("Área Total: " + zoo.areaTotalAnimais());
    }

    public  Habitat criarHabitat(String nomeHabitat) {
        switch (nomeHabitat.toLowerCase()) {
            case "jaula":
                return new Habitat("Jaula", "Localização da jaula", 10, 10);
            case "gaiola":
                return new Habitat("Gaiola", "Localização da gaiola", 8, 8);
            case "aquário":
                return new Habitat("Aquário", "Localização do aquário", 15, 15);
            case "lago":
                return new Habitat("Lago", "Localização do lago", 20, 20);
            case "viveiro":
                return new Habitat("Viveiro", "Localização do viveiro", 12, 12);
            default:
                System.out.println("Habitat inválido! Será criado um habitat genérico.");
                return new Habitat("Habitat Genérico", "Localização genérica", 10, 10);
        }
    }
}
