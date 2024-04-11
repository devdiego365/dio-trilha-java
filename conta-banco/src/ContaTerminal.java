import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
       
        System.out.println("Digite seu nome:");
        String nome = scan.next();

        System.out.println("Digite a sua agencia:");
        int agencia = scan.nextInt();
        
        int saldo = 1000;
        System.out.println("Seu saldo é: " + saldo);

        System.out.println("Ola "+nome+" obrigado por criar uma conta em nosso banco sua agencia é "+agencia+ " e seu saldo é "+saldo
                + "e ja esta disponivel para saque.");

    }
}
