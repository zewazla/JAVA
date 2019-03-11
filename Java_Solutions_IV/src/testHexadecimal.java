//Program zamienia liczbę z systemu dziesiętnego na szesnastkowy.


import java.util.Scanner;

public class testHexadecimal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write number to convert from decimal to hexadecimal:");
        int i = input.nextInt();
        String hex = Integer.toHexString(i);
        System.out.println("Hex value is " + hex);
    }
}
