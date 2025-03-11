import java.util.*;


public class Main {
    public static void main(String[] args) {
        /* ArrayList<Integer> lista = new ArrayList<Integer>();
  Random rand = new Random();
        for (int i = 1; i <= 15; i++) {
            lista.add(rand.nextInt(100));
            System.out.println(lista.get(i));
        }*/

        HashSet<String> set = new HashSet<String>();
            set.add("TEST1");
            set.add("TEST2");
        for (String s : set) {
            System.out.println(s);
        }
    }
}