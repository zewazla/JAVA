import java.util.Random;

public class RandomDoubleFloat {
    public static void main(String[] args) {
        Random r = new Random();

        //Losowanie liczby od 0.00 do 1.00
        double d = r.nextDouble();
        float f = r.nextFloat();
        System.out.println(d);
        System.out.println(f);

        //Losowanie liczb od 0.00 do 5.00
        double a = r.nextDouble() * 5;
        float b = r.nextFloat() * 5f;
        System.out.println(a);
        System.out.println(b);

    }

}

