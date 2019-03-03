public class Main {

    public static void main(String[] args) {
       int i = 5;

        System.out.println("while:");
       while (i > 0 && i < 10)    // pętla while
       {
           System.out.println(i + " ");
           i++;
       }
        System.out.println("do while:");
        i = 0;                    // petla do while
        do {
           System.out.println(i + " ");
           i++;
       } while ( i > 0 && i < 10);
       }
    }

