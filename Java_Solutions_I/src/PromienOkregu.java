import java.util.Scanner;

public class PromienOkregu {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj promien r:");
        final double pi = 3.14;
        int r;
        r = scanner.nextInt();


        System.out.println("Obwód = " + 2 * pi * r);
        System.out.println("Pole = " + pi * r * r);
    }

}
