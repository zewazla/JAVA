import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //przykład 1
        System.out.println("przykład 1");
        for (int i = 2; i < 10; i+=2)  //i < 10 --> warunek końcowy, liczby od 2 do 10 co druga
        {
            System.out.println(i);
        }


        //przykład 2
        System.out.println("przykład 2");
        for (int i = 0; i < 10; i++)  //i < 10 --> warunek końcowy, liczby od 1 do 10 co jeden --> i++
        {
            System.out.println(i);
        }
    }
}
