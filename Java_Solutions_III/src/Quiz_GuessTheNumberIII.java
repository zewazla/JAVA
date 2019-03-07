//Użytkownik ma za zadanie odgadnąć liczbę wylosowana przez komputer z przedziału od 0 do 10.
// W tym programie otrzymuje podpowiedź "za mała", "za duża"

import java.util.Random;
import java.util.Scanner;

public class Quiz_GuessTheNumberIII {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Random random = new Random();
        int komputer = random.nextInt(10);

//        System.out.println(komputer);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę w zakresie od 1 do 10:");
        int liczba = input.nextInt();

        while (liczba != komputer) {

            if (liczba > komputer) {
                System.out.println("Za duża. Próbuj dalej...");
            } else if (liczba < komputer) {
                System.out.println("Za mała. Próbuj dalej...");
            }
            liczba = input.nextInt();
        }
        System.out.println("BRAWO! Odgadłeś tajemniczą liczbę.");

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Twój czas: " + testTime/1000 + " sekundy");

    }

}

