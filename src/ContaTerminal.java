import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String agencia = "";
        int conta = 0;
        String nomeCliente = "";
        double saldo = 0.0;

        System.out.println("Por favor, digite o número da agencia: ");
        agencia = scan.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        conta = scan.nextInt();
        scan.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o saldo em conta: ");
        saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo de R$ %.2f" +
                "já está disponível para saque.", nomeCliente, agencia, conta, saldo);

        scan.close();
    }
}
