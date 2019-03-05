/*Napisz program, który na poczatku wczyta do zmiennej double pewna liczbe, która bedzie
reprezentowala kwote w polskich zlotówkach. Zadanie polega na napisaniu ile monet poszcze-
gólnych nominalów potrzeba aby rozmienic cala kwote. Na przyklad dla 11 zlotych wynikiem
powinno byc: 2 pieciozlotówki, 1 jednozlotówka i zadnych innych monet.
1 złoty = 100 groszy
2 złote = 200 groszy
5 złoty = 500 groszy
12,45 zł = 12,45 * 100 = 1245 groszy
*/

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kwotę, np. 12.34:");
        double kasa = input.nextDouble();

        //rozmiana kasy na grosze
        int rozmiana_kasy = (int)(kasa * 100);
        System.out.println("Twoja kasa zawiera " + rozmiana_kasy + " groszy");

        //rozmiana kasy na 5 złotówki
        int kasa_piec_zloty = (int)(rozmiana_kasy/500);
        System.out.println("Twoja kasa zawiera " + kasa_piec_zloty + " pięciozłotówek");

        //rozmiana kasy na 2 złotówki
        int kasa_dwa_zlote = (int)(rozmiana_kasy/200);
        System.out.println("Twoja kasa zawiera " + kasa_dwa_zlote + " dwózłotówek");

        //rozmiana kasy na 1 złotówki
        int kasa_jeden_zloty = (int)(rozmiana_kasy/100);
        System.out.println("Twoja kasa zawiera " + kasa_jeden_zloty + " jednozłotówek");

        //rozmiana kasy na 50 groszówki
        int kasa_50_groszy = (int)(rozmiana_kasy/50);
        System.out.println("Twoja kasa zawiera " + kasa_50_groszy + " piedziesięciogroszówek");

        //zamiana kasy na 20 groszówki
        int kasa_20_groszy = (int)(rozmiana_kasy/20);
        System.out.println("Twoja kasa zawiera " + kasa_20_groszy + " dwudziestogroszówek");

        //zamiana kasy na 10 groszówki
        int kasa_10_groszy = (int)(rozmiana_kasy/10);
        System.out.println("Twoja kasa zawiera " + kasa_10_groszy + " dziesięciogroszówek");

        //zamiana kasy na 2 groszówki
        int kasa_2_grosze = (int)(rozmiana_kasy/2);
        System.out.println("Twoja kasa zawiera " + kasa_2_grosze + " dwugroszówek");

        //zamiana kasy na 5 groszówki
        int kasa_5_groszy = (int)(rozmiana_kasy/5);
        System.out.println("Twoja kasa zawiera " + kasa_5_groszy + " pięciogroszówek");

    }
}
