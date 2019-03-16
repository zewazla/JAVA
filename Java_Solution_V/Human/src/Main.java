public class Main extends Human{

    public static void main(String[] args) {
        Human czlowiek = new Human();
        System.out.println("To jest człowiek." );

        czlowiek.getAge();
        System.out.println("wiek: " + czlowiek.wiek);
        czlowiek.getHeight();
        System.out.println("wzrost: " + czlowiek.wzrost);
        czlowiek.getMale();
        System.out.println("płeć: " + czlowiek.plec);
        czlowiek.getName();
        System.out.println("imię: " + czlowiek.imie);
        czlowiek.getWeight();
        System.out.println("waga: " + czlowiek.waga);


    }
}
