//klasa
//dane są public --> brak get. ... w main

public class Human {
    public int wiek;
    public int waga;
    public int wzrost;
    public String imie;
    public String plec;

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

