// Program zamienia liczbę z systemu dziesiętnego na szestnastkowy
// np. 41970 = (A3F2)hex

import java.util.Scanner;

public class Hexadecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = input.nextInt();


        while (liczba != 0) {
            int x = liczba % 16;        //reszta z dzielenia przez 16
            liczba = liczba / 16;       //wynik dzielenia przez 16

            {
                if (x == 0)
                System.out.println("0");
                else if (x == 1)
                    System.out.println("1");
                else if (x == 2)
                    System.out.println("2");
                else if (x == 3)
                    System.out.println("3");
                else if (x == 4)
                    System.out.println("4");
                else if (x == 5)
                    System.out.println("5");
                else if (x == 6)
                    System.out.println("6");
                else if (x == 7)
                    System.out.println("7");
                else if (x == 8)
                    System.out.println("8");
                else if (x == 9)
                    System.out.println("9");
                else if (x == 10)
                    System.out.println("A");
                else if (x == 11)
                    System.out.println("B");
                else if (x == 12)
                    System.out.println("C");
                else if (x == 13)
                    System.out.println("D");
                else if (x == 14)
                    System.out.println("E");
                else if (x == 15)
                    System.out.println("F");

            }
        }
    }
}