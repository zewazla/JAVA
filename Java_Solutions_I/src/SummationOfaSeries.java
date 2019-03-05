// Program liczy sumę cyfr od 1 do 10: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = ?

public class SummationOfaSeries {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                sum = sum + j;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}

