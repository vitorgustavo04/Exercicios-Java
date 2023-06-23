import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nc, nome, depInicial, desejaSaque;
        double valorInicial, saldo, deposito, valorSaque, saldoAtualizado;
        
        System.out.println("===========================");
        System.out.println("Seja bem-vindo ao JAVA BANK");
        System.out.println("===========================");
        System.out.println("Insira seus dados abaixo para continuar.");
        
        System.out.print("Número da conta: ");
        nc = scanner.nextLine();
        
        System.out.print("Nome do titular: ");
        nome = scanner.nextLine();
        
        System.out.print("Existe um depósito inicial? [S/N]: ");
        depInicial = scanner.nextLine();
        
        if (depInicial.equalsIgnoreCase("S")) {
            valorInicial = 200;
            System.out.println("Saldo em conta: R$" + valorInicial);
            saldo = valorInicial;
        } else {
            valorInicial = 0;
            System.out.println("Saldo em conta: R$" + valorInicial);
            
            System.out.print("Insira o depósito que deseja fazer: ");
            deposito = scanner.nextDouble();
            
            saldo = valorInicial + deposito;
            System.out.println("Saldo atual em conta: R$" + saldo);
        }
        
        System.out.print("Você deseja realizar um saque? [S/N]: ");
        desejaSaque = scanner.next();
        
        if (desejaSaque.equalsIgnoreCase("S")) {
            System.out.print("Insira o valor para saque: ");
            valorSaque = scanner.nextDouble();
            
            if (valorSaque > saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
                saldoAtualizado = (saldo - valorSaque) - 5;
                System.out.println("Seu saldo atual é: R$" + saldoAtualizado);
            }
        } else if (desejaSaque.equalsIgnoreCase("N")) {
            System.out.println("Atendimento encerrado!");
        }
        
        scanner.close();
    }
}
