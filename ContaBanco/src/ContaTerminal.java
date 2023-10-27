import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Integer numero;
        Integer agencia;
        String nomeCliente;
        Double saldo;
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();
        System.out.println("Digite a agência:");
        agencia = scanner.nextInt();
        System.out.println("Digite o seu nome:");
        nomeCliente = scanner.next();
        System.out.println("Digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", " +
                           "obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numero +" e seu saldo " + saldo + 
                           " já está disponível para saque");
    }
}
