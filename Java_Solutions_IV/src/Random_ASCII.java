//

import java.util.Random;

public class Random_ASCII {
    public static void main(String[] args){
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'A');
        System.out.println(c);

        char cc = (char)(r.nextInt(26) + 'a');
        System.out.println(cc);
    }
}
