public class Main {

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

// s = 0
// s += i  to samo co  s = s + i
//zaczynamy od zera: s = 0 and i = 1
// i = 1: s = 0 + 1 = 1
// i = 2: s = 1 + 2 = 3
// i = 3: s = 3 + 3 = 6
// i = 4: s = 6 + 4 = 10
// i = 5: s = 10 + 5 = 15
// i = 6: s = 15 + 6 = 21
// i = 7: s = 21 + 7 = 28
// i = 8: s = 28 + 8 = 36
// i = 9: s = 36 + 9 = 45
// i =10: s = 45 + 10 = 55
// Wynik będzie więc = 55
