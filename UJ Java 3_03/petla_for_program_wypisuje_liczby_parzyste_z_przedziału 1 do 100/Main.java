public class Main {

    public static void main(String[] args) {
        int x = 1; //liczba startowa

        while(x <= 100) //drukowanie liczb parzystych z przedziału 1 - 100
        {
            if (x % 2 == 0)
            {
                System.out.println(x);
            }
            x++; // x = x + 1
        }
    }
}
