// Napisz program, który policzy sumę liczb podanych przez użytkownika .
// Program kończy pytać o kolejne dane i wypisuje wuynik , gdy użytkownik poda 0.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan =  new Scanner (System.in);

        int sum = 0;
        System.out.println("Podaj liczbę:");
        int y = scan.nextInt(); // zmienna, która przechowuje wszystkie wartości dodawane

        while (y != 0)
        {
            sum += y;
            System.out.println("Podaj liczbę:");
            y = scan.nextInt();
        }
        System.out.println("Sum = " + sum);
    }
}
