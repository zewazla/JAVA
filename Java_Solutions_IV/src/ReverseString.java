// Napisz program, który odwraca wyraz, tzw rewers.


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wyraz:");
        String wyraz = input.next();

        String revers = "";

        for (int i = wyraz.length() - 1; i >= 0; i--)
            revers += wyraz.charAt(i);

        System.out.println(revers);

    }
}

