public class Odcinek {
    Punkt p1;
    Punkt p2;

    Odcinek() {
        p1 = new Punkt(1.4, 7.2);
        p2 = new Punkt(1.4, 7.2);
    }

    Odcinek(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    void info() {
        System.out.println("Punkty definiujące odcinek");
        p1.wypiszPunkt();
        p2.wypiszPunkt();
    }

    double dlugoscOdcinka() {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2.) + Math.pow(p1.getY() - p2.getY(), 2.));
    }

}