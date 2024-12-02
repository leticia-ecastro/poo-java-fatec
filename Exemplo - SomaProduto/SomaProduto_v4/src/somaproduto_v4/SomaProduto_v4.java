package somaproduto_v4;

import java.util.Scanner;
import java.util.Arrays;

public class SomaProduto_v4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n1, n2, soma, produto;
        
        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite outro número: ");
        n2 = entrada.nextInt();
        
        entrada.close();
        
        System.out.print("\nSoma e Produto: " + Arrays.toString(somaProduto (n1, n2)));
    }
    
    static int[] somaProduto (int n1, int n2) {
        int saida[] = new int[2];
        saida[0] = n1 + n2;
        saida[1] = n1 * n2;
        return saida;
    }
}