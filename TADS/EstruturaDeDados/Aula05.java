import java.util.Scanner;

public class Aula05 {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    // definindo uma variável lista do tipo listaJava
    ListaJava1 lista = new ListaJava1();

    System.out.println("Entre com um valor");
    int valor = scanner.nextInt();


    // Esse código da errado pq o values é privado
//    if (valor > 0) {
//      lista.values[0] = valor;
//    }
//    lista.values[0] = -1;

      lista.add(valor);
      lista.add(valor + 1);
      lista.add(valor + 2);
      lista.add(valor + 3);
      
    // Acessar valor do index desejado
    
    Integer retorno = lista.find(3);
    System.out.println("O valor buscado é: " + retorno);

    System.out.println("A minha lista é: " + lista);
  }

}
