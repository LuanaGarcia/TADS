import java.util.Scanner;

public class TDE02 {

  public static void main(String[] args) {
    //exer. 3 - Crie um programa em Java que receba uma String como entrada do usuário e conte o número de caracteres maiúsculos, minúsculos, dígitos e caracteres especiais presentes na String. Em seguida, imprima esses valores.

    //Entrada do texto
  Scanner scanner = new Scanner(System.in);
  System.out.println("Digite um texto qualquer");
  String texto = scanner.nextLine();

    //Percorrer a string char por char 
    int contMaiusculas = 0;
    int contMinusculas = 0;
    int contNumeros = 0;
    int contEspeciais = 0;
    for(int i = 0; i < texto.length(); i++){
      char letra = texto.charAt(i);
      
      if (Character.isUpperCase(letra)) {
        contMaiusculas ++;
      } else if (Character.isLowerCase(letra)) {
        contMinusculas ++;
      } else if (Character.isDigit(letra)) {
        contNumeros ++;
      }else {
        contEspeciais ++;
      }
      
    }
    System.out.println("Cont Maiusculas: " + contMaiusculas);
    System.out.println("Cont Minusculas: " + contMinusculas);
    System.out.println("Cont Numeros: " + contNumeros);
    System.out.println("Cont Especiais: " + contEspeciais);
   
  } 
}
