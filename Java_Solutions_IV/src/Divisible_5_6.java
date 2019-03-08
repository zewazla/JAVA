//Napisz program, który wyświetla wszystkie liczby od 100 do 1000, które są podzielne przez 5 i 6. Liczby są
//oddzielone dokładnie jedną spacją.

public class Divisible_5_6 {
    public static void main(String[] args){

        for (int i = 100; i < 1000; i++ ){
            if (i % 5 ==0 && i%6 == 0){
                System.out.printf("%3d ",i );
            }

        }
    }
}
