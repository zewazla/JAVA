public class Main
{
    public static void main (String[] args)
    {
        int tab[] = new int[5];
        tab[0] = 6;
        tab[1] = 4;
        tab[2] = 3;
        for(int i=0; i<tab.length; i++)
        {
            System.out.println("Element tablicy = " + tab[i]);
        }
        for (int x : tab)
        {
            System.out.println(x);
        }
        int n = 10;
        while(n>0)
        {
            System.out.println("liczba " + n);
            n--;
        }
        do{
            System.out.println("tekst");
            n++;
        }
        while (n<5);
        {
            System.out.println("koniec");
        }
    }
}
