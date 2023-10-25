import java.util.HashMap;
import java.util.Map;

public class CobaHashMap {
    public static void main(String[] args) {
        Map<String, Integer> angka = new HashMap<>();

        angka.put("satu", 1);
        angka.put("dua", 2);

        System.out.println(angka.get("tiga"));
    }
}
