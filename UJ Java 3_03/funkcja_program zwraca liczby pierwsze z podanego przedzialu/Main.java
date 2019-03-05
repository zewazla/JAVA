// Napisz program, który wypisze na ekran liczby pierwsze z zadanego przedziału.
// Pamiętaj o zasadzie modularyzacji kodu. Podziel problem na pojedyńcze podproblemy.

import java.util.Scanner;

public class Main {

    public static boolean liczba_pierwsza(int x) {
        boolean yes = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                yes = false;
                break;          //przerywamy bo nie ma sensu sprawdzac dalej
            }
        }
        return yes;
    }

    public static void liczby_pierwsze_przedzial(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (liczba_pierwsza(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
        liczby_pierwsze_przedzial(x, y);
    }
}