class Human {
    static int age;
    static double weight;
    static double height;
    static String name;
    static boolean isMale;

    public Human(int age, double weight, double height, String name, boolean isMale) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.isMale = isMale;
    }

    public boolean isMale() {
        return isMale;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

}

class Main {
    public static void main(String[] args) {        //jezeli sa statyczne 'static' zmienne beda mialy taka sama wartosc
        Human.age = 34;
        Human.height = 134;
        Human.isMale = true;
        Human.name = "Ala";
        Human.weight = 24;

        System.out.println("Wiek: " + Human.age);
        System.out.println("Wyrost: " + Human.height);
        System.out.println("Waga: " + Human.weight);
        System.out.println("Plec: " + Human.isMale);
        System.out.println("Imie: " + Human.name);

        Human h = new Human(10, 20, 130, "Ala", true);
    }
}

