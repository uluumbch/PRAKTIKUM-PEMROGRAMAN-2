import java.util.Scanner;

public class LoopingInput {
    public static void main(String[] args) {
        final double angka = 10.34;


        Scanner input = new Scanner(System.in);

        int i = input.nextInt();

        while (i<=10){
            System.out.println("halo "+i);
            i++;
        }
    }
}
