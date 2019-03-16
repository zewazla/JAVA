public class Main extends Human{

    public static void main(String[] args) {
        Human czlowiek = new Human();
        System.out.println("To jest człowiek." );

        czlowiek.getAge();
        System.out.println("wiek: " + czlowiek.getAge());
        czlowiek.getHeight();
        System.out.println("wzrost: " + czlowiek.getHeight());
        czlowiek.getMale();
        System.out.println("płeć: " + czlowiek.getMale());
        czlowiek.getName();
        System.out.println("imię: " + czlowiek.getName());
        czlowiek.getWeight();
        System.out.println("waga: " + czlowiek.getWeight());


    }
}


// jeżeli mamy dane 'private', np wiek i chcemy sie do niego dostac odwolujemy sie do "get.Age" poniewaz jest 'public'