// Napisz program, który zamieni stopnie Celsjusza na Fahrenhajta. Stopnie C użytkownik wypisze z klawiatury.


import java.util.Scanner;

public class ConvertCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj stopnie Celsiusza: ");

        double celsius = input.nextDouble();

        double fahrenhait = (9./5.) * celsius + 32;

        System.out.println(celsius + " stopni/e Celsjusza to " + fahrenhait + " stopni/e Fahrenhajta.");



    }
}
