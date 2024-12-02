package somaproduto;

import java.util.Scanner;

public class SomaProduto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n1, n2, soma, produto;
        
        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite outro número: ");
        n2 = entrada.nextInt();
        
        entrada.close();
        
        soma = n1 + n1;
        produto = n1 * n2;
        
        System.out.println("\nSoma: " + soma);
        System.out.println("\nProduto: " + produto);
    }
}
