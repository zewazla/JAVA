public class Table_multi {

    public static void main(String[] args) {

        int[][] tab_4 = new int[2][4]; //przypisanie
        for (int i = 0; i < tab_4.length; i++) {
            for (int j = 0; j < tab_4.length; j++)
                System.out.print(tab_4[i][j] + " ");
            System.out.println();
        }
        System.out.println();

        int[][] tab_5 = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < tab_5.length; i++) {
            for (int j = 0; j < tab_5.length; j++)
                System.out.print(tab_5[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
}