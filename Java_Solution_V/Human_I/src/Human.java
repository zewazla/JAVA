//klasa

public class Human {
    public int wiek;            //jezeli mamy public jest to dostepne dla wszystkich
    public int waga;
    private int wzrost;
    private String imie;        //jeżeli mamy private w main odwolujemy sie do get.Name poniewaz jest publiczne
    private String plec;

    public Human() {
        wiek = 6;
        waga = 30;
        wzrost = 140;
        imie = "Ala";
        plec = "kobieta";
    }


//metody

    public int getAge() {
        return wiek;
    }
    public int getWeight(){
        return waga;
    }
    public int getHeight(){
        return wzrost;
    }
    public String getName(){
        return imie;
    }
    public String getMale(){
        return plec;
    }

}

