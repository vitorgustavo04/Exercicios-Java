import java.util.Scanner;

public class App {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double peca1, n1, v1, vt1, peca2, n2, v2, vt2, resultado ;
    
    System.out.println("Código da peça 1:");
    peca1 = sc.nextDouble();
    System.out.println("Número de peças 1 compradas:");
    n1 = sc.nextDouble();
    System.out.println("Valor individual da peça 1:");
    v1 = sc.nextDouble();
    vt1 = n1 * v1;
    
    System.out.println("Código da peça 2:");
    peca2 = sc.nextDouble();
    System.out.println("Número de peças 2 compradas:");
    n2 = sc.nextDouble();
    System.out.println("Valor individual da peça 2:");
    v2 = sc.nextDouble();
    vt2 = n2 * v2;
    resultado = vt1 + vt2;
    System.out.println("Valor total da compra: R$ " + resultado);
    
  }
}