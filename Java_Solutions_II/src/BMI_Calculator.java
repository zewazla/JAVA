/* Mass Index (BMI) is a measure of
        health on weight. It can be calculated by taking your weight in kilograms and
        dividing by the square of your height in meters. Write a program that prompts the
        user to enter a weight in pounds and height in inches and displays the BMI. Note
        that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/


import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args){
        Scanner input_waga = new Scanner(System.in);
        System.out.println("Podaj swoja wagę w kilogramach: ");
        double waga = input_waga.nextDouble();
        Scanner input_wzrost = new Scanner(System.in);
        System.out.println("Podaj swój wzrost w m: ");
        double wzrost = input_wzrost.nextDouble();
        double bmi = waga/(wzrost*wzrost);

        System.out.println("Twoje BMI wynosi: " + bmi);

    }


}