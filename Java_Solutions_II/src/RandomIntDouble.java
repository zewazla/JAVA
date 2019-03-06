

import java.util.Random;

public class RandomIntDouble {
    public static void main(String[] args) {
        Random r = new Random();

        // Losowanie liczby z zakresu [0,35] do zmiennej a.
        System.out.println("zakres [0, 35]");
        int a = r.nextInt(35);
        System.out.println(a);

        // Losowanie liczby z zakresu [-5,15] i wyświetlenie jej na konsolę.
        System.out.println("zakres [-15, 15]");
        System.out.println( r.nextInt(21)-5 );
        // 21, bo w przedziale [-5,15] jest 21 liczb i -5, bo to najmniejsza liczba w zakresie.

        //Losowanie liczby z zakresu [-20, -10] do zmiennej a:
        System.out.println("zakres [-20, -10]");
        a = r.nextInt(11)-20;
        System.out.println(a);

        //Losowanie liczby z zakresu [x, y] gdzie zmienne x i y to liczby całkowitoliczbowe o dowolnej wartości;
        // przy czym x jest mniejsze od y.
        System.out.println("zakres [x, y]");
        int x = 3;
        int y = 12;
        a = r.nextInt(y - x + 1) + x;
        System.out.println(a);


    }
}
