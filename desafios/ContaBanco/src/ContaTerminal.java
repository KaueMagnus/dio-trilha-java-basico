import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite seu nome e sobrenome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Por favor, agora a sua agência: ");
        String agencia = scanner.next();
        System.out.print("Insira o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Insira a quantia do seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
        
    }
}
