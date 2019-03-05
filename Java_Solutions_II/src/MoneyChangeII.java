import java.util.Scanner;

public class MoneyChangeII {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kwote:");
        double kasa = input.nextDouble();

        int a = (int)(kasa/5);
        kasa %= 5;
        System.out.println("Ilosc pięciozłotówek = " + a);

        int b = (int)(kasa/2);
        kasa %= 2;
        System.out.println("Ilość dwuzłotówek = " + b);

        int c = (int)(kasa/1);
        kasa %= 1;
        System.out.println("Ilość złotówek: " + c);

        int d = (int)(kasa/.5);
        kasa %= 0.5;
        System.out.println("Ilość 50 groszówek: " + d);

        int e = (int)(kasa/.2);
        kasa %= .2;
        System.out.println("Ilość 20 groszówek: " + e);

        int f = (int)(kasa/.02);
        kasa %= .02;
        System.out.println("Ilość 2 groszówek: " + f);

        int g = (int)(kasa/.01);
        kasa %= .01;
        System.out.println("Ilość 1 groszówek: " + g);


    }
}
