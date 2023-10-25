import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class CobaArrayList {
    public static void main(String[] args) {
        Collection<Mahasiswa> nama = new ArrayList<Mahasiswa>();

        nama.add(new Mahasiswa("bachrul"));
        Mahasiswa test = new Mahasiswa("test");
        nama.add(test);
//
//        nama.addAll(Arrays.asList("satu", "dua"));
//
//        nama.remove("bachrul");


        for (var satunama: nama) {
            System.out.println(satunama.getNama());
        }

        System.out.println(new Random().nextInt());
    }
}
