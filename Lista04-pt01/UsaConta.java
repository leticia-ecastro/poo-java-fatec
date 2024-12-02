
import java.util.Scanner;

public class UsaConta {
	
	public static void main (String[] args) {
		Conta conta = new Conta();
		Scanner entrada = new Scanner (System.in);
		char resposta = ' ';
		
		System.out.print("Informe a quantidade de clientes: ");
		conta.setQuantidadePessoas(entrada.nextInt());
		System.out.print("Informe o valor da conta: ");
		conta.setValorConta(entrada.nextDouble());
		System.out.print("A taxa de servico (10% do garcom)  sera cobrada?: [S] = sim, [N] = nao: ");
		resposta = entrada.next().toLowerCase().charAt(0);
		entrada.close();
		
		if (resposta == 's') {
			conta.setTaxaGarcom(true);
		} else {
			conta.setTaxaGarcom(false);
		}
		
		System.out.print("Valor que cada pessoa pagara: R$" + conta.pagarConta());
	}
}

