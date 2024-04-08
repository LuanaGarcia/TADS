import java.util.Scanner;

public class TDEex04 {

  public static void main(String[] args) {
    
    //Escadinha de string

    //Entrada do texto
  Scanner scanner = new Scanner(System.in);
  System.out.println("Digite a quantidade de degraus");
  int degraus = scanner.nextInt();

    for(int i=0; i<degraus; i++){ //Percorre a quantidade de degraus

      //Prenecher os espaços
      for(int j = 1; j<= degraus-i; j++){
        System.out.print(" ");
      }

      //Printando estrels nos degraus vazios
      for(int k = 1; k <= i; k++){
        System.out.print("*");
      }

      System.out.println();
    }

  }
}
