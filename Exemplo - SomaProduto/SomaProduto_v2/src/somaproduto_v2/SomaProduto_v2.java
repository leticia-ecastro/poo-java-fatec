package somaproduto_v2;

import java.util.Scanner;

public class SomaProduto_v2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n1, n2, soma, produto;
        
        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite outro número: ");
        n2 = entrada.nextInt();
        
        entrada.close();
        
        System.out.println("\nSoma: " + soma (n1, n2));
        System.out.println("\nProduto: " + produto (n1, n2));
    }
    
    static int soma (int n1, int n2) {
        return n1 + n2;
    }
    
    static int produto (int n1, int n2) {
        return n1 * n2;
    }
}