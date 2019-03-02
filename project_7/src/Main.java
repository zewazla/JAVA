import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        //zadanie 1.1
        System.out.println("---------- zadanie 1.1 ---------\n");
        System.out.println("Hello World");

        //zadanie 1.2
        int x = 1;
        System.out.println("----------- zadanie 1.2 --------------");
        System.out.printf("%-10d%-10d%-10d\n", x, x * x, x * x * x);
        System.out.printf("%-10d%-10d%-10d\n", x, x * x, x * x * x);

        //zadanie 1.5
        System.out.println("-------------- zadanie 1.5 -----------\n");
        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));

        //zadanie 1.6
        System.out.println("---------- zadanie 1.3 -------------\n");
        System.out.println(1+2+3+4+5+6+7+8+9);

        //zadanie dodatkowe
        System.out.println("-------- zadanie dodatkowe --------\n");
        System.out.println(1/5); // dzielienie liczb całkowitych
        System.out.println(1/5.); //jedna z liczb jest zmiennoprzecinkowa - konwersja do typu float; zaokrąglenie do liczby całkowitej
        System.out.println(1./5);

        //zadanie 1.7
        System.out.println("--------- zadanie 1.7 ---------\n");
        System.out.println(4 * (1 - 1./3 + 1./5 - 1./7 + 1./9 - 1./11));

        //zadanie 1.12
        System.out.println("--------- zadanie 1.12 -----------\n");

        //zadanie dodatkowe
        final int y = 1; //zmienna będzie cały czas taka //modulo: reszt a z dzielenia
        int z = 2;
        int wynik;
        wynik = y + z;
        System.out.println("Wynik = " + wynik);

        //zadanie dodatkowe
        System.out.println("------------ zadanie dodatkowe / inkrementacja-----------");
        int a = 1, b = 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = b++; //a = b potem a += 1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = ++b; // a+=1 potem a = b
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //zadanie dodatkowe
        System.out.println("----- zadanie dodatkowe /dekrementacja ------------");
        int c = 1, d = 10;
        c = d--;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        c = --d;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //zadanie 1.1.1
        System.out.println("---------------zad 1.1.1 -----------------");
        int q = 3;
        System.out.println(q);
        float f = 2;
        System.out.println(f);
        double u = 3.4;
        System.out.println(u);
    }
}