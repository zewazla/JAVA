// Napisz program, który wylosuje liczbę całkowitą z przedziału od 35 do 50, oraz zmiennoprzecinkową
// z przedziału 1.40 do 2.90

import java.util.Random;

public class RandomZadanie_1 {
    public static void main(String[] args){
        Random r = new Random();
        int a = r.nextInt(16)+35;
        System.out.println("Wylosowana liczba całkowita: " + a);

        double x = 1.4;
        double y = 2.90;
        double z = r.nextDouble()*(y-x)+x;
        System.out.println("wylosowana liczba zmiennoprzecinkowa: " + z);
    }
}
