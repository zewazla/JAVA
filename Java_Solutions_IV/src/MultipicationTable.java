// tabliczka mnożenia

public class MultipicationTable {
    public static void main(String[] args){

        int i = 1, j = 1;
        for (i = 1; i <= 10; i++){
            for (j = 1; j <=10; j++){
                System.out.printf("%4d",i*j );
            }
            System.out.println();   //złamanie linii
        }

    }
}
