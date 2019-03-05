import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(1000), d = 2;
        System.out.println("x = " + x);

        if (x % 2 == 0) {
            System.out.println("Liczba " + x + " jest podzielna przez " + d);
        }
        else
        {
            System.out.println("Liczba " + x + " nie jest podzielna przez " + d );
        }
    }
}