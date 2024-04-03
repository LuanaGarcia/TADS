import java.util.Scanner;

public class Aula02 {

  public static void main(String[] args) {
    // Mostrando a string em array de char
    // String curso = "TADS - Terceiro período";

    // for (int i = 0; i < curso.length(); i++){
    // System.out.println(curso.charAt(i));
    // }

    // Definindo um Array/vetor
    int[] nota = new int[4];
    // nota[0] = 10;
    // nota[1] = 10;
    // nota[2] = 10;
    // nota[3] = 10;

    // Scanner scanner = new Scanner(System.in);

    // for (int i = 0; i < 4; i++){
    // System.out.println("Digite a nota nº " + (i+1));
    // nota[i] = scanner.nextInt();
    // }

    // for (int i = 0; i < 4; i++){
    // System.out.println("O valor do item " + (i+1) + " é: " + nota[i]);
    // }

    // Trabalhando com matrizes - array de 2 ou mais dimensões
    
    int[][] matriz = new int[3][3];

      int cont = 1;
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++){
          matriz[i][j] = cont;
          cont++;
        }
      }
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++){
          System.out.println(matriz [i][j]);
        }
      }
  }
}