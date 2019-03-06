// Po wczytaniu wartosci sprawdzmy, czy dlugosc promienia jest dodania, jezeli jest to wykonujemy program tak jak wczesniej, w przeciwnym
//wypadku wyswietlamy informacji o nieprawidlowych danych wejsciowych.

import java.util.Scanner;

public class PoleKola_if {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj promień r:");
        final double pi = 3.14;
        int r;
        r = scanner.nextInt();

        if (r <= 0) {
            System.out.println("Wprowadż liczbę całkowitą dodatnią!");

        } else {
            System.out.println("Obwód = " + 2 * pi * r);
            System.out.println("Pole = " + pi * r * r);
        }
    }
}