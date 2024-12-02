package somaproduto_v5;

import java.util.Scanner;

public class SomaProduto_v5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n1, n2, soma, produto;
        
        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();
        
        System.out.print("Digite outro número: ");
        n2 = entrada.nextInt();
        
        entrada.close();
        
        System.out.print("\nSoma e Produto: " + somaProduto(n1, n2));
    }
    
    static SomaProdutoPOO somaProduto (int n1, int n2) {
        SomaProdutoPOO sp = new SomaProdutoPOO();
                
        sp.soma = n1 + n2;
        sp.produto = n1 * n2;
        return sp;
    }
}