import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        EmpresaRH empresaRH = new EmpresaRH();
        Scanner num = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("+--------------------+");
            System.out.println("         Menu         ");
            System.out.println("+--------------------+");
            System.out.println("1. Cadastrar candidato");
            System.out.println("2. Cadastrar vaga");
            System.out.println("3. Exibir candidatos");
            System.out.println("4. Exibir vagas");
            System.out.println("5. Cadastrar candidato em vaga");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = num.nextInt();
            num.nextLine();

            switch (opcao) {
                case 1:
                    empresaRH.cadastrarCandidato();
                    break;
                case 2:
                    empresaRH.cadastrarVaga();
                    break;
                case 3:
                    empresaRH.exibirCandidatos();
                    break;
                case 4:
                    empresaRH.exibirVagas();
                    break;
                case 5:
                    empresaRH.cadastrarCandidatoVaga();
                    break;
                case 6:
                    empresaRH.exibirCandidatoVaga();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);

    }
}
