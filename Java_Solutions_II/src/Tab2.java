import java.util.Scanner;

public class Tab2 {
    //krok 0: wczytaj 'kasa'
    //krok 1: wez nominal z tablicy
    //krok 2: ilosc_monter = kasa /nominal
    //        kasa = kasa % nominal
    //krok 3: wypisz ilosc monet i nominal
    //krok 4: wez kolejny nominal z tablicy i skocz do kroku 2
    
    public static void main(String[] args){
        double nominaly[] = {5, 2, 1, .5, .2, .1, .02, .01};


        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kwote:");
        double kasa = input.nextDouble();

        for (double nominal: nominaly){
            int ilosc_montet = (int)(kasa /nominal);
            kasa = kasa % nominal;
            System.out.printf("[%3d]:%3f\n",ilosc_montet, nominal);


        }
    }
}
