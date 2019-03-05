/*Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
pierwiastek z a = Math.pow(a, 0.5)
*/

import java.util.Scanner;

public class DistanceOfTwoPoints {
    public static void main(String[] args){
        Scanner input_x1 = new Scanner(System.in);
        System.out.println("Podaj wartosc x1:");
        double x1 = input_x1.nextDouble();

        System.out.println("Podaj wartosc x2:");
        Scanner input_x2 = new Scanner(System.in);
        double x2 = input_x2.nextDouble();


        System.out.println("Podaj wartosc y1:");
        Scanner input_y1 = new Scanner(System.in);
        double y1 = input_y1.nextDouble();

        System.out.println("Podaj wartosc y2:");
        Scanner input_y2 = new Scanner(System.in);
        double y2 = input_y2.nextDouble();

        double distance = Math.pow(Math.pow(x1-x2,2)+ (Math.pow(y1-y2,2)),0.5);
        System.out.println("Odległość między punktami wynosi " + distance);

    }

}
