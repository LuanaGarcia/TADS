import java.util.HashSet;
import java.util.Set;

public class Aula7 {

  public static void main(String[] args) {

    Set<Integer> a = new HashSet<>();
    a.add(1);
    a.add(2);
    a.add(3);
    a.add(4);
    a.add(8);
    a.add(12);
    a.add(99);

    Set<Integer> b = new HashSet<>();
    b.add(3);
    b.add(7);
    b.add(8);
    b.add(9);
    b.add(3);
    b.add(14);
    b.add(0);

    System.out.println("Conjunto A: "+a);
    System.out.println("Conjunto B: "+b);

    //Uniaõ entre a e b
    //boolean b1 = a.addAll(b);
    //System.out.println("Union A+B: "+a);

    //Intersecção ente a e b
    a.retainAll(b);
    System.out.println("Intersection: " + a);
    
  }

}
