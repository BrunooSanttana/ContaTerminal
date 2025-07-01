
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Por gentileza informe o seu nome completo: ");
        var nameClient = scanner.nextLine();
        System.out.println("Informe o número da sua agência: ");
        var  agencyClient = scanner.nextLine();
        System.out.println("Informe o número da sua conta: ");
        var  accountClient = scanner.nextInt();
        double balance = 300;

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println(  " Olá " + nameClient + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencyClient + ", conta: " + accountClient + ", e seu saldo de " + nf.format(balance) + " já está disponível para saque. "  );
    }
}

