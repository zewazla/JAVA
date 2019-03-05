//Napisz program, w którym zdefinujesz zmienną int seconds = 10000000; program ma napisać, ile dni, ile godzin, ile minut znajduje się w tej liczbie sekund.

public class IntSecond {
    public static void main(String[] args){

        int seconds = 10000000;

        System.out.println("Ilosc dni wynosi: " + (seconds/(24 * 60 * 60)));
        System.out.println("Ilosc godzin wynosi: " + (seconds/(60 * 60)));
        System.out.println("Ilosc minut wynosi: " + (seconds/(60)));
    }



}
