//wypisz wszystkie liczby całkowite z przedziału 1 do 1000 --> 1, 3, 9, 27, 81, ...

public class Main {

    public static void main(String[] args) {
        int x = 1; //liczba startowa

        while(x < 1000) //drukowanie wszystkich liczb od 1 do 1000
        {
            System.out.println(x);
            x*=3;
        }
    }
}
