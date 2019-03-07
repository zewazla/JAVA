//Użytkownik ma za zadanie odgadnąć liczbę wylosowana przez komputer z przedziału od 0 do 10.

import java.util.Random;
import java.util.Scanner;

public class Quiz_GuessTheNumberII {
    public static void main(String[] args) {
        Random random = new Random();
        int komputer = random.nextInt(10);

//        System.out.println(komputer);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę w zakresie od 1 do 10:");
        int liczba = input.nextInt();

        while (liczba != komputer){
            System.out.println("Zła odpowiedź. Spróbuj ponownie.");
            liczba = input.nextInt();
        }
        System.out.println("BRAWO! Odgadłeś tajemniczą liczbę.");

    }
}

