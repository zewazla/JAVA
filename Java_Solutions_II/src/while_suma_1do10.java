public class while_suma_1do10{

    public static void main(String[] args) {
        int s = 0, i = 1;

        while (i <= 10)
        {
            s += i;
            i++;
        }
        {
            System.out.println("sum = " + s);
        }
    }
}