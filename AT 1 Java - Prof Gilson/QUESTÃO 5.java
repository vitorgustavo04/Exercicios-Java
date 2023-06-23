import java.util.Scanner;

/*
 * Ler o valor total da compra e aplicar as respectivas funções de acordo com a escolha do usuário
 *
 * Autor: Sidcley Barros e Vitor Gustavo
 */

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalCompra;
        int opcaoEscolha;
        System.out.print("Qual foi o valor total da compra?");
        totalCompra = sc.nextFloat();
        System.out.println("Escolha a opção de pagamento");
        System.out.println("Opção 1 - À vista com 10% de desconto");
        System.out.println("Opção 2 - Parcelado em 2x sem desconto e sem juros");
        System.out.println("Opção 3 - Dividido em 10x com juros de 5% no valor total");
        System.out.println("Escolha a opção 1, 2 ou 3!");
        opcaoEscolha = sc.nextInt();
        if (opcaoEscolha == 1){
            double valorDesconto;
            valorDesconto = (totalCompra * 0.9);
            System.out.println("O valor final da compra foi " + valorDesconto);
        }
        if (opcaoEscolha == 2){
            double valorParcelado;
            valorParcelado = (totalCompra / 2);
            System.out.println("A compra foi parcelada em 2x de R$" + valorParcelado);
        }
        if (opcaoEscolha == 3){
            double valorDez, valorParceladoDez;
            valorDez = (totalCompra * 1.05);
            valorParceladoDez = (valorDez / 10);
            System.out.println("A compra foi parcelada em 10x de R$" + valorParceladoDez + " com um valor total de R$" + valorDez);
        }
        }
    }