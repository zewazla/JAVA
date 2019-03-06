

import java.util.Random;

public class RandomFloat {
    public static void main(String[] args){
        Random r = new Random();
        float x = -1.40f;
        float y = 0.9f;
        float a = r.nextFloat()*(y-x)+x;
        System.out.println(a);

    }

}
