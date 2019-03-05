/*
(Find the number of years) Write a program that prompts the user to enter the
seconds (e.g., 1 billion), and displays the number of years and days for the seconds.
For simplicity, assume a year has 365 days.
*/

import java.util.Scanner;

public class FindTheNumberOfYears {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund:");
        int sekundy = input.nextInt();
        int minuty = (sekundy/60);
        int dni = (sekundy)/(24 * 60 * 60);
        int lata = ((sekundy)/(365 * 24 * 60 * 60));

        System.out.println(sekundy + " sekund to " + lata + " lat " + dni + " dni");
        System.out.println(sekundy + " sekund to " +  dni + " dni");
        System.out.println(sekundy + " sekund to " +  minuty + " minut");

    }

}
