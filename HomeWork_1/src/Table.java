public class Table {
    public static void main(String[] args){

        System.out.printf("%3s %6s %5s\n", "b", "b^2", "b^3" );
        System.out.printf("-------------------\n" );

        for (int a = 1; a <=4; a++) {

            System.out.printf("%3d %5d %5d\n", a, a * a, a * a * a );
        }

    }
}
