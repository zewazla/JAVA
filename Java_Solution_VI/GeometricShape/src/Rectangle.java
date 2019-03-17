

public class Rectangle extends GeometricShape {
    private double width;
    private double height;

    public Rectangle(int i, int i1) {
        width = 10;
        height = 20;
    }
    //konstruktor

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(double w, double h) {
        super();
        width = w;
        height = h;
    }

    public Rectangle(double w, double h, String color, boolean filled) {
        super(color, filled);
        width = w;
        height = h;
    }

    //metody

    public double getArea() {
        return width * height;
    }

    public double getParimeter() {
        return 2 * height + 2 * width;
    }

    public void setHeight() {
        this.height = height;
    }

    public void setWidth() {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}



