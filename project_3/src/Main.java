//tablice jedno i wielowymiarowe

public class Main
{
    public static void main (String[] args)
    {
        int tab[] = new int[9];
        tab[0] = 6;
        tab[1] = 9;
        tab[2] = 2;
        tab[3] = 6;
        tab[4] = 6;
        for (int i = 0; i<tab.length; i++)
        {
            System.out.println("Element tablicy = " + tab[i]);
        }

    }
}
