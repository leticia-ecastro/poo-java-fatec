import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        String nome, tipo;
        int quantidade;
        double preco;
        System.out.println("Quantos produtos deseja adicionar?");
        int qtd = 0;

        while (true) {
            try {
                qtd = num.nextInt();
                if(qtd > 100){
                      System.out.print("Quantidade inválida, digite novamente(máximo: 100): ");  
                    }else{
                      break;  
                    }
            } catch (InputMismatchException e) {
                System.out.println("Erro, entrada inválida");
                num.next();
            }
        }

        List<Frios> listaFrios = new ArrayList<>();
        List<Paes> listaPaes = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite o nome do produto: ");
            nome = str.nextLine();

            System.out.println("Digite o tipo do produto (Frios ou Paes): ");
            tipo = str.nextLine();

            while (true) {
                try {
                    System.out.println("Digite a quantidade do produto: ");
                    quantidade = num.nextInt();
                    if(quantidade > 100){
                      System.out.println("Quantidade inválida, o maximo é 100!");  
                    }else{
                      break;  
                    }
                    
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite um número inteiro válido.");
                    num.next();
                }
            }

            while (true) {
                try {
                    System.out.println("Digite o preço do produto: ");
                    preco = num.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Digite um número válido.");
                    num.next();
                }
            }

            if (tipo.equalsIgnoreCase("Frios")) {
                Frios frio = new Frios(nome, preco, quantidade, tipo);
                listaFrios.add(frio);
            } else if (tipo.equalsIgnoreCase("Paes")) {
                Paes pao = new Paes(nome, preco, quantidade, tipo);
                listaPaes.add(pao); 
            }
        }

        double somaPrecosFrios = 0.0;
        double somaPrecosPaes = 0.0;

        for (Frios frio : listaFrios) {
            somaPrecosFrios += frio.getPreco() * frio.getQuantidade();
        }

        for (Paes pao : listaPaes) {
             System.out.println(pao.getNome());
            System.out.println(pao.getPreco());
            System.out.println(pao.getQuantidade()); 
            System.out.println(pao.getTipo()); 
        }
        for (Frios frio : listaFrios) {
            System.out.println(frio.getNome());
            System.out.println(frio.getPreco());
            System.out.println(frio.getQuantidade()); 
            System.out.println(frio.getTipo()); 
        }

        System.out.println("Soma dos valores dos Frios: " + somaPrecosFrios);
        System.out.println("Soma dos valores dos Paes: " + somaPrecosPaes);
    }
}