import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula06 {


  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    List<String> lista = new ArrayList();

    lista.add("String 1");
    lista.add("String 2");
    lista.add("String 3");
    lista.add("String 4");
    lista.add("String 5");
    lista.add("String 6");
    lista.add("String 6");

    String value = scanner.nextLine();

    int indice = lista.indexOf(value);
    int ultimoIndice = lista.lastIndexOf(value);
    System.out.println("A posição do item é: " + indice);
    System.out.println("A ultima posição do item é: " + ultimoIndice);

    String remove = lista.remove(ultimoIndice);
    System.out.println("Removeu: " + remove);

    boolean removeu = lista.remove("String 6");
    System.out.println("Removeu? " + removeu);

    for(int i = 0; i<lista.size(); i++){
      System.out.println(lista.get(i));
    }

  }
}
