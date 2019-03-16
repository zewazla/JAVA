public class Punkt {
    private double x;
    private double y;

    Punkt() {
        x = y = 0;
    }

    Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void setX(double x) {
        this.x = x;
    }

    void setY(double y) {
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    void wypiszPunkt() {
        System.out.println("(" + x + ", " + y + ")");
    }


}


