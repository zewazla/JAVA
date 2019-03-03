// program losuje liczbę w przedziału 0 - 100 i następnie prosi uzytkownika aby zgadł tą liczbę.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(100);
        //System.out.println(x);     //---> jezeli chcemy sprawdzić tą wylosowaną liczbę
        System.out.println("Podaj liczbę: ");
        int y = scan.nextInt();

        while (y != x){
            if (y < x)
            {
                System.out.println("Podana liczba była mniejsza");
            }
            else
            {
                System.out.println("Podana liczba była większa");
            }

            System.out.println("Podaj liczbę jeszcze raz: ");
            y = scan.nextInt();
        }
        System.out.println("Gratulacje");
    }
}
