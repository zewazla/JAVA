import java.util.Random;

public class RandomDFxy {
    public static void main(String[] args){
        Random r = new Random();
        double x = 1.40;
        double y = 2.90;
        double a = r.nextDouble()*(y-x)+x;
        System.out.println(a);

    }

}
