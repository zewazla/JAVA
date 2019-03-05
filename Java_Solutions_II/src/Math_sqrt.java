// pierwiastek drugiego stopnia

package sqrt_abs;

import java.util.Scanner;

public class Math_sqrt {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        double liczba = input.nextDouble();
        double i = liczba;

        System.out.println(Math.sqrt(i));
    }

}
