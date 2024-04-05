import java.util.Arrays;

public class ListaJava1 {

    private final int LIST_SIZE = 10;
    private int tamanho = 0;

    public Integer[] values = new Integer[LIST_SIZE];

    public void add(Integer value) {
        // TODO validar se a lista já atingiu o limite
        // TODO validar se o valor do objeto é maior que zero
        if (value > 0 && value < 1000) {
          for (int i = 0; i < this.values.length; i++) {
              if (this.values[i] == null) {
                  System.out.println("Adicionando o " + value);
                  this.values[i] = value;
                  tamanho++;
                  break;
              }
          }
        } else {
            System.out.println("O número não pode ser adicionado.");
        }

    }

    public Integer find(int index) {
        // TODO retorne o item pedido
        //return null;
        if (index < LIST_SIZE) {
          return this.values[index];
        }
        return -999;
    }

    private void aumentarTamanho() {
        // TODO DESAFIO!! Descobrir uma maneira de aumentar o tamanho do array (substituir)
    }

    @Override
    public String toString() {
        return "ListaJava1 [LIST_SIZE=" + LIST_SIZE + ", tamanho=" + tamanho + ", values=" + Arrays.toString(values)
                + "]";
    }


    

//    @Override
//    public String toString() {
        // TODO Crie um método para imprimir
//        return null;
//    }
}

