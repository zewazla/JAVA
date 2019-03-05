import java.util.Random;

public class Main
{
    public static void main (String[] args)
    {
        Random liczba = new Random();

        System.out.println(liczba.nextDouble());
        System.out.println(liczba.nextGaussian());
        System.out.println(liczba.nextInt(1000));
        System.out.println(liczba.nextInt(10));
    }
}