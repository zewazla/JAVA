// rzutowanie:

//---------- reformat code: -------------
//        int a = 1;
//        double b = 4.5;
//        int c = b;
//        double d = a;



public class ReformatCode {
    public static void main(String[] args){

        int a = 1;
        double b = 4.5;
        int c = (int) b;
        double d = (double) a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
