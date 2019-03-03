import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz działanie: +, -, *, /");
        String c = scanner.next();
        int x, y;
        System.out.println("x = ");
        x = scanner.nextInt();
        System.out.println("y = ");
        y = scanner.nextInt();

        switch (c)
        {
            case "+":
                System.out.println(x + "+" + y + "=" + (x + y));
                break;
            case "-":
                System.out.println(x + "-" + y + "=" + (x - y));
                break;
            case "*":
                System.out.println(x + "*" + y + "=" + (x * y));
                break;
            case "/":
                System.out.println(x + "/" + y + "=" + (x / y));
                break;
            default:
                System.out.println(":)");



        }
        System.out.println("KONIEC");

    }
}
