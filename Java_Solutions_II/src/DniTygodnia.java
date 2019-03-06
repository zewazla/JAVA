import java.util.Scanner;

public class DniTygodnia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj cyfrę od 0 do 6: ");
        int cyfra = input.nextInt();

        if (cyfra == 0) {
            System.out.println("Poniedziałek");
        } else if (cyfra == 1) {
            System.out.println("Wtorek");
        } else if (cyfra == 2) {
            System.out.println("Sroda");
        } else if (cyfra == 3) {
            System.out.println("Czwartek");
        } else if (cyfra == 4) {
            System.out.println("Piątek");
        } else if (cyfra == 5) {
            System.out.println("Sobota");
        } else if (cyfra == 6) {
            System.out.println("Niedziela");
        }   else
            System.out.println("Wprowadź poprawną cyfrę z przedzialu 0 - 6");


    }

}

