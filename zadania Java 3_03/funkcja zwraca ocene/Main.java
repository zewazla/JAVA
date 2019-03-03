// Zadanie z pdf. --> Napisz metodę, która przyjmuje dwa parametry typu int i wzraca większą z tych liczb.
//Napisz funkcję, która zwraca ocenę z podanych zakresów:
// 100% = ocena 5
//[70%, 80%) = ocena 4
// [50% , 60%) = ocena 3
// <50% = niezaliczone

import java.util.Scanner;
public class Main {

        public static void ocena(double x) {
            if (x < .5) {
                System.out.println("niezaliczony");
            }
            else if (x < 0.6) {
                System.out.println("3");
            }
            else if (x < 0.7) {
                System.out.println("3+");
            }
            else if (x < 0.8) {
                System.out.println("4");
            }
            else if (x < 0.9) {
                System.out.println("4+");
            }
            else
                System.out.println("5");
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double x;
            for (int i = 0; i < 10; i++) {
                x = scan.nextDouble();
                ocena(x);
            }
    }
}
