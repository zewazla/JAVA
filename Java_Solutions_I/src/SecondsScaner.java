//program, w którym komputer prosi o podanie zmiennej int seconds; program ma napisać, ile dni, ile godzin, ile minut znajduje się w liczbie sekund przez nas podanej.

import java.util.Scanner;

public class SecondsScaner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę sekund: ");
        int seconds = scanner.nextInt();

        System.out.println("Ilosc dni wynosi: " + (seconds/(24 * 60 * 60)));
        System.out.println("Ilosc godzin wynosi: " + (seconds/(60 * 60)));
        System.out.println("Ilosc minut wynosi: " + (seconds/(60)));






    }
}
