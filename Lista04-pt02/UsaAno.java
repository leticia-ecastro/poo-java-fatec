/*
 * Letícia Elaine de Castro
 * 
 * Elabore um programa em java que contenha um método booleano que teste se um ano é ou não bissexto. Anos divisíveis por 4 são bissextos, exceto para aqueles divisíveis por 100, ao menos que sejam também divisíveis por 400.
 */
 
 
import java.util.Scanner;
import java.util.GregorianCalendar;

public class UsaAno {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		Ano ano = new Ano();

		System.out.print("Entre com o ano: ");
		ano.setAno(entrada.nextInt());
		entrada.close();
		System.out.print("\nO ano " + ano.getAno() + (ano.isBissexto() ? " é bissexto!" : " não é bissexto!"));
		
		//Verifica se o ano é bissexto
		GregorianCalendar hoje = new GregorianCalendar();
		System.out.println(hoje.isLeapYear(2023));
	}
}

