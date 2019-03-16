public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Factorial f = new Factorial(i);
            System.out.println(i + "! = " + f.countFactorial());
        }
    }
}
