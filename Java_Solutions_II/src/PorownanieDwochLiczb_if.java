//Wczytaj dwie liczby z klawiatury. Wypisz komunikat czy liczyb są sobie równe albo, że pierwsza jest większa od drugiej i na odwrót.

import java.util.Scanner;

public class PorownanieDwochLiczb_if {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę x: ");
        int x = input.nextInt();

        System.out.println("Podaj liczbe y: ");
        int y = input.nextInt();


        if (x == y) {
            System.out.println("Liczba x jest równa liczbie y");
        }   else if(x>y) {
            System.out.println("Liczba x jest większa od y");
        }   else if(x<y){
            System.out.println("Liczba x jest mniejsza od liczby y");

        }

    }
}
