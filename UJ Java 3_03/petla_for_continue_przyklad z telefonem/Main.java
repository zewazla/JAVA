// pzrykład z telefonem - ktoś dzwoni i nas rozprasza podczas oglądania TV, my ta osobę ignorujemy nie odbieramy i oglądamy dalej --> continue

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int x;

        for (int i = 0; i < 100; i++) {
            x = rand.nextInt(100);
            if (i > 25 && x < 75){
                continue;           /// mimo ze nas ktos dzwoni, nie odbieramy i kontynujemy oglądanie TV
            }
            System.out.println(i);
        }
        System.out.println(":)");
    }
}
