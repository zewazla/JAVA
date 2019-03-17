//Circle dziedziczy wszystkie własciwości z GeometricShape

public class Circle extends GeometricShape {
    private double radius;

    //konstruktor

    public Circle() {
        super();    //'super' odnosi się bezpośrednio do klasy GeometricShape --> stworzenie obiektu klasy nadrzędnej
        radius = 0;
    }

    Circle(double r) {
        super();        //jeżeli go nie wpiszemy to program automatycznie wywołuje super domyślnie
        radius = r;
    }

    Circle(double r, String color_c, boolean filled_f){
        super(color_c, filled_f);
        radius = 5;
    }


    //metody

    public double getRadius() {
        return radius;
    }

    public double setRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }


}

