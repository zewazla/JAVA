public class Main {

    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y){
        return x + y;
    }

    public static void sum_wypisz(int x, int y) {
        System.out.println(x + "+" + y + "=" + (x + y));
    }

    public static void main(String[] args) {
        int a = 10, b = 12;
        System.out.println(a + "+" + b + "=" + sum(a, b));
        System.out.println(4 + "+" + 7 + "=" + sum(4, 7));
        System.out.println(4 + "+" + a + "=" + sum(4, a));

        System.out.println(4.5 + "+" + 7.2 + "=" + sum(4.5, 7.2));

        System.out.println("------------------------------");

        sum_wypisz(a, b);
        sum_wypisz(4, a);
        sum_wypisz(4, 7);

    }
}

