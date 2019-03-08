import java.util.Scanner;

public class Sentinel_do_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        int suma = 0;

        do {
            suma = suma + liczba;
            liczba = scanner.nextInt();
        }   while (liczba != 0);

        System.out.println("Suma podanych przez Ciebie liczb = " + suma);


    }
}