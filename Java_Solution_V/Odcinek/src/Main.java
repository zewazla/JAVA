public class Main{

    public static void main(String[] args) {
        Punkt p1 = new Punkt(7, 5.5);
        p1.wypiszPunkt();
        Odcinek o = new Odcinek(p1, new Punkt(9.4, -2.3));
        o.info();
        System.out.println("Długość: " + o.dlugoscOdcinka());
    }
}
