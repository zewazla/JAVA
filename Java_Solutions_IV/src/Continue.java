//Program liczy sumę podanych przez nas cyfr. Jeżeli suma cyfr jest większa lub równa 20 program się zatrzymuje i wyświetla wynik.
// gdy liczba jest == 2 lub liczba == 10 program działa nadal.


import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = input.nextInt();

        int suma = 0;
        while (liczba < 20) {
            liczba = input.nextInt();
            if (liczba == 2 || liczba == 10)
                continue;
            suma = suma + liczba;
        }
        {
            System.out.println(suma);
        }
    }
}