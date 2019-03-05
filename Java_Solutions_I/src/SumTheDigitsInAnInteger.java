//Write a program that reads an integer between 0 and
//1000 and adds all the digits in the integer. For example, if an integer is 932 , the
//sum of all its digits is 14 .
//Hint: Use the % operator to extract digits, and use the / operator to remove the
//extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93

import java.util.Scanner;

public class SumTheDigitsInAnInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number between 1 - 10000:");
        int number = scanner.nextInt();

        int jednosci = number % 10;
        number /= 10;
        int dziesiatki = number % 10;
        number /= 10;
        int setki = number % 10;
        number /= 10;
        int tysieczne = number % 10;
        number /= 10;

        int sum = jednosci + dziesiatki + setki + tysieczne;

        System.out.println("The sum of the digits is: " + sum);

        System.out.println("----- extra task: inverted number ------");
        System.out.println(jednosci);
        System.out.println(dziesiatki);
        System.out.println(setki);
        System.out.println(tysieczne);
    }




}
