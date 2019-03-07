import java.util.Random;
import java.util.Scanner;

public class Quiz_GuessTheNumber {
    public static void main(String[] args){
        Random random = new Random();
        int komputer = random.nextInt(10);

//        System.out.println(komputer);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = input.nextInt();

        if (liczba == komputer)
            System.out.println("BRAWO! Tajemnicza liczba to " + komputer);
          else if (liczba > komputer)
            System.out.println("Ta liczba jest za duża. Spróbuj ponownie.");
          else if (liczba < komputer)
            System.out.println("Ta liczba jest za mała. Spróbuj ponownie");
        }
    }

