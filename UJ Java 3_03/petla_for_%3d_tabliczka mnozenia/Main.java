//tabliczka mnożenia

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%3d", i * j);  //musi być printf aby móc zachować odstępy między liczbami
            }
            System.out.println();  //łamiemy wiersz, aby wszystko nie było w jednej linii
        }

    }
}