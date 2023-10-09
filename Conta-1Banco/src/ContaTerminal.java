import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Digite o numero da Agencia: ");
        agencia = sc.next();
        System.out.println("Digite o numero da conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.next();
        sc.next();
        System.out.println(" Digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é "
         + agencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}