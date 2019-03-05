// przykład z samochodem - złapany kapeć na 90 km i pojawia się bużka

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int x;

        for (int i = 0; i < 1000; i++) {
            x = rand.nextInt(100);
            if (i > 90){
                break;
        }
            System.out.println(i);
        }
        System.out.println(":)");
    }
}
