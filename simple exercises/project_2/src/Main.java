public class Main
{
    public static void main(String[] args)
    {
        //zadanie 1
        System.out.println("Zadanie 1");
        byte b1 = 127;
        b1++;
        b1++;
        System.out.println("Wynik b1 = " + b1);
        System.out.println("");

        //zadanie 3: Utwórz dwie zmienne int o nazwach z1 i z2, o wartościach odpowiednio 15 i 5, a następnie wydrukuj na ekranie:
        System.out.println("Zadanie 3");
        int z1 = 15;
        int z2 = 5;
        int zad1 = z1 + z2;
        int zad2 = z1 - z2;
        int zad3 = z1 * z2;
        int zad4 = z1 / z2;
        System.out.println("Wynik = " + zad1);
        System.out.println("Wynik = " + zad2);
        System.out.println("Wynik = " + zad3);
        System.out.println("Wynik = " + zad4);
        System.out.println("");

        //zadanie 4: Utwórz zmienną typu char o nazwie letter i wartości a. Następnie wykonaj inkrementację i wydrukuj na ekranie wartość tej zmiennej. Jaka jest teraz jest wartość? Spodziewałeś się takiej odpowiedzi? Poeksperymentuj z tą zmienną.
        System.out.println("Zadanie 4");
        char letter = 'd';
        letter++;
        System.out.println("Inkrementacja = " + letter);
        letter--;
        System.out.println("Inkrementacja = " + letter);
        System.out.println("");

    }
}
