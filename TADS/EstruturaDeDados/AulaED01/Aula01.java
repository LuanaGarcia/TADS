import java.util.Scanner;

public class Aula01 {
  public static void main(String[] args) {
    System.out.println("Olarrrrrr javeiros");

//    int num1 = 2;
//    int num2 = 2;
//    int soma = num1 +num2;
    
//    System.out.println("A soma dos números é: "+ soma);

      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite um número: ");
      int num = scanner.nextInt();

      System.out.println("Digite mais um número: ");
      int num2 = scanner.nextInt();

      System.out.println("A soma dos números é: "+ (num+num2));
    }
}