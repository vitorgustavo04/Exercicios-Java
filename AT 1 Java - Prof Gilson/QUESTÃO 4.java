import java.util.Scanner;

public class App {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double peso, kilo, resultado;
    
    System.out.println("Peso total do prato:");
    peso = sc.nextDouble();
    kilo = 23.0;
    resultado = kilo * peso;
    System.out.printf("O valor total do prato é: R$ %.2f", resultado);
    
  }
}