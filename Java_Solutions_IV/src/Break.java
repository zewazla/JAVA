//Program liczy sumę podanych przez nas cyfr. Jeżeli suma cyfr jest większa lub równa 20 program się zatrzymuje i wyświetla wynik.


import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = input.nextInt();

        int suma = 0;
        while (liczba < 20) {
            liczba = input.nextInt();
            suma = suma + liczba;
            if (suma >= 20)
                break;
        }
            {
                System.out.println(suma);
            }
        }
    }