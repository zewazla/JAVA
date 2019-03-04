//Załóżmy, że biegacz biegnie 24 mil w ciągu 1 godziny, 40 minut i 35 sekund.
// Napisz program wyświetlający średnią prędkość w kilometrach na jedena godzine. (Pamiętaj, że 1 mile to 1,6 km.)
// 1h = 60min = 3600s
// 1 mil = 1.6 km
// 24 mil = 38.4 km

public class SpeedRunner {

    public static void main(String[] args){

        double km = 38.4;
        int czas = 6035;
        System.out.println("Srednia prędkość biegacza wynosi: "+ ((3600.*km)/czas) + " km/h");
    }
}
