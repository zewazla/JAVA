//Wylosuj wartość zmiennej x z przedziału 1000 do 2000.
// Korzystając z wyrażenia warunkowego wypisz informację o przestępności roku wyrażonego przez zmienną x.

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = 1000 + rand.nextInt(1000);
        System.out.println("x = " + x);

        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
            System.out.println("Rok " + x + " jest przestępny");
        }
        else
        {
            System.out.println("Rok " + x + " nie jest przestępny");
        }
    }
}
