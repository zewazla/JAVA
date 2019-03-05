/* Mass Index (BMI) is a measure of
        health on weight. It can be calculated by taking your weight in kilograms and
        dividing by the square of your height in meters. Write a program that prompts the
        user to enter a weight in pounds and height in inches and displays the BMI. Note
        that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
        bmi = waga(k)/(wzrost(m))^2
*/


import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner input_waga = new Scanner(System.in);
        System.out.println("Podaj swoja wagę w kilogramach: ");
        double waga = input_waga.nextDouble();
        Scanner input_wzrost = new Scanner(System.in);
        System.out.println("Podaj swój wzrost w m: ");
        double wzrost = input_wzrost.nextDouble();
        double bmi = waga / (wzrost * wzrost);

        System.out.println("Twoje BMI wynosi: " + bmi);

        double i = bmi;
        if (i<= 18.5) {
            System.out.println("Niedowaga");
        }
            else if (i > 18.8 && bmi < 24.99) {
            System.out.println("Waga prawidłowa");
        }
            else {
            System.out.println("Nadwaga");
        }

    }
}



