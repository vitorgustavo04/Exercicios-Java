import java.util.Scanner;

public class App {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B, C, aq, ar;
    double a3, ac, at;
    
    System.out.println("Valor de A: ");
    A = sc.nextInt();
    System.out.println("Valor de B: ");
    B = sc.nextInt();
    System.out.println("Valor de C: ");
    C = sc.nextInt();
    a3 = (A * C) / 2;
    ac = 3.14 * Math.pow(C, 2);
    at = ((A+B) * C) / 2;
    aq = B * B;
    ar = A * B;
    System.out.println("A área do triângulo é: " + a3);
    System.out.println("A área do círculo é: " + ac);
    System.out.println("A área do trapézio é: " + at);
    System.out.println("A área do quadrado é: " + aq);
    System.out.println("A área do retângulo é: " + ar);
  }
}