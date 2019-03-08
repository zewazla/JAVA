// pętla while
// Program sumuje liczby podane przez użytkownika.
// Po wpisaniu przez użytkownika cyfry 0 program kończy działanie i podaje ostateczną sumę.
// 0 jest wartownikiem /strażnikiem --> Sentinel

import java.util.Scanner;

public class Sentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        int suma = 0;

        while (liczba != 0) {
            suma = suma + liczba;
            liczba = scanner.nextInt();
        }
        System.out.println("Suma podanych przez Ciebie liczb = " + suma);


    }
}