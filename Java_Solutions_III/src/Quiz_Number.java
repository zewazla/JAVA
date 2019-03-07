// Komputer losuje dwie liczby, po czym pyta użytkownika ile wynosi suma tych liczb.
// Zła odpowiedz --> wyświetlenie komunikatu "Zła odpowiedź"
// poproawna odpowiedz --> wyświetlenie komunikatu "Dobra odpowiedź"


import java.util.Random;
import java.util.Scanner;

public class Quiz_Number {
    public static void main(String[] args){
        Random number_1 = new Random();
        int x = number_1.nextInt(30);
        Random number_2 = new Random();
        int y = number_2.nextInt(30);

        int wynik = x + y;


        Scanner input = new Scanner(System.in);
        System.out.println("Ile wynosi suma: " + x + " + " + y + " = ");
        int odpowiedz = input.nextInt();

        if (odpowiedz == wynik){
            System.out.println("BRAWO! Odpowiedż prawidłowa.");
        }   else{
            System.out.println("Zła odpowedź. Spróbuj jeszcze raz.");

        }



    }
}
