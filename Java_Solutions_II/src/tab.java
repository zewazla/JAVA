import java.util.Scanner;

public class tab {
    public static void main(String[] args){
        double table[] = {5, 2, 1, .5, .2, .1, .02, .01};

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kwote:");
        double kasa = input.nextDouble();

        for (double y: table){
            System.out.println(y);

            int a = (int)(kasa/table[0]);
            kasa %= table[0];
            System.out.println("Ilosc pięciozłotówek = " + a);

            int b = (int)(kasa/table[1]);
            kasa %= table[1];
            System.out.println("Ilosc dwuzłotówek = " + b);

            int c = (int)(kasa/table[2]);
            kasa %= table[2];
            System.out.println("Ilość dwuzłotówek = " + c);

            int d = (int)(kasa/table[3]);
            kasa %= table[3];
            System.out.println("Ilość złotówek: " + d);

            int e = (int)(kasa/table[4]);
            kasa %= table[4];
            System.out.println("Ilość 50 groszówek: " + e);

            int f = (int)(kasa/table[5]);
            kasa %= table[5];
            System.out.println("Ilość 20 groszówek: " + f);

            int g = (int)(kasa/table[6]);
            kasa %= table[6];
            System.out.println("Ilość 2 groszówek: " + g);

            int h = (int)(kasa/table[7]);
            kasa %= table[7];
            System.out.println("Ilość 1 groszówek: " + h);

            break;






        }
    }
}
