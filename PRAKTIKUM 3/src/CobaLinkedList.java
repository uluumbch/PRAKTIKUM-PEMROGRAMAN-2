import java.util.Collection;
import java.util.LinkedList;

public class CobaLinkedList {
    public static void main(String[] args) {
        Collection angka = new LinkedList<Integer>();

        angka.add(1);
        angka.add(1);
        angka.add(1);
        angka.add(1);

        Integer jumlahAngka = 0;
        for (var tiapangka: angka.toArray()){
            System.out.println(tiapangka);

        }
    }
}
