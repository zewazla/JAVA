import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int sum = 0;
        System.out.println("Podaj liczbę:");
        int y;

        do
        {
            System.out.println("Podaj liczbę:");
            y = scan.nextInt();
            sum += y;
        }
        while (y != 0);
        System.out.println("sum = " + sum);
    }
}
