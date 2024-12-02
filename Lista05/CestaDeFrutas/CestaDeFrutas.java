import java.util.Scanner;

public class CestaDeFrutas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fruta cesta[] = new Fruta[100];
        boolean ok = true;
        String nome, cor;

        do {
            //Para tratar Exceções:
            try {
                ok = true;

                System.out.print("Entre com o nome da maçã: ");
                nome = entrada.nextLine();
                System.out.print("Entre com a cor da maçã: ");
                cor = entrada.nextLine();

                cesta[0] = new Maca(nome, cor);

            } catch (ArrayIndexOutOfBoundsException erro1) {
                //System.out.println(">>> ERRO FATAL: " + erro1.getMessage()); //pega a mensagem de Exceção e imprime ela
                System.out.println(">>> ERRO FATAL: Posição inválida para a lista de frutas."); //imprime uma mensagem bonitinha ao invés de imprimir aquela mensagem de Exceção que o Java imprime
            }
            
            catch (IllegalArgumentException erro2) {
                System.out.println(">>> " + erro2.getMessage()); //pega a mensagem de Exceção e imprime ela
                ok = false;
            }
            catch (Exception erro3) {
                System.out.println("> ERRO FATAL: " + erro3.getMessage()); //pega a mensagem de Exceção e imprime ela
                //ex.printStackTrace();
                //imprime toda a stack/pilha de execução de erro da Exception
            }

        } while (!ok);

        entrada.close();
        
        System.out.println(cesta[0]); //invoca o toString() da instância criada Maca
    }
}
/*
Exception = pode ser tratada
Error = não pode ser tratado. Exemplos: problemas físicos como erro com o link do disco do pc; a memória disponível para a Virtual Machine do Java acaba. 

try (tenta executar)
catch (pega a Exception)
*/
