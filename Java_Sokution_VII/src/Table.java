public class Table {

    public static void main(String[] args) {

        int[] tab_1 = new int[5];
        // elementy tablic tworzonych za pomoca new nazwa_tablicy[n] maja inicjalne wartosci '0'
        // (0 dla typow liczbowych, false dla typu boolean, null dla typow referencyjnych)

        for (int i = 0; i < tab_1.length; i++)
            System.out.print(tab_1[i] + " ");
        System.out.println("\n");

        int[] tab_2 = {1, 2, 3};
        for (int i = 0; i < tab_2.length; i++)
            System.out.print(tab_2[i] + " ");
        System.out.println("\n");

        int[] tab_3;
        tab_3 = new int[]{1, 2, 3, 4};
        for (int i = 0; i < tab_3.length; i++)
            System.out.print(tab_3[i] + " ");
        System.out.println("\n");
    }
}