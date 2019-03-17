public class GeometricShape {
    private String color;
    private boolean filled;

    //konstruktor

    public GeometricShape() {
        color = "red";
        filled = true;
    }


    //konstruktor, w który będziemy podawali nasze parametry

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //metody

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
