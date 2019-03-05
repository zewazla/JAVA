public class Main
{
    public static void main(String[] args)
    {
        int table[][] = {{2, 3, 4}, {1, 2, 3}};

            for (int i = 0; i<table.length; i++)
            {
                for (int j = 0; j < table[i].length; j++)
                {
                    System.out.println(table[i][j]);
                }
            }

            for (int a = 5; a>0; a--)
            {
                for (int b = 5; b<10; b++)
                    System.out.println("Zmienna a = " + a + ", zmienna b = " + b);
            }
    }
}