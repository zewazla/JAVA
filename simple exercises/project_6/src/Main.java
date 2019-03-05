//instrukcje warunkowe


public class Main
{
    public static void main(String[] args)
    {
//wyświetli się pierwszy prawidłowy wynik

        int a = 10;
        if (a<10)
            System.out.println("a<10");
        else if (a==10)
            System.out.println("a=10");
        else
            System.out.println("a>10");

//każda instrukcja zostaje wykonana i każdy wynik prawidłowy zostaje wyświetlony

        int z = 13;
        if (z<13)
            System.out.println("z<13");
        if (z==13)
            System.out.println("z=13");
        if (z>8)
            System.out.println("z>8");
        else
            System.out.println("z>13");

//instrukcje zagnieżdżone

        int x =7;
        if(x<10)
        {
            System.out.println("x<10");
            if(x==8)
                System.out.println("x=8");
            else
                System.out.println("x!=8");
        }

//instrukcja switch

        int b = 4;
        switch (b)
        {
            case 1:
                System.out.println("b=1");
                break;
            case 2:
                System.out.println("b=2");
                break;
            case 3:
                System.out.println("b=3");
                break;
            case 4:
                System.out.println("b=4");
                break;
            case 5:
                System.out.println("b=5");
                break;
            case 6:
                System.out.println("b=6");
                break;
        }
    }
}
