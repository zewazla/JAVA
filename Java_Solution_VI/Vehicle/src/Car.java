
class Car extends Vehicle {
    private static final int NUMBER_OF_WHEELS = 4;

    public Car(String engine) {             //konstruktor.
        super(engine, NUMBER_OF_WHEELS);
    }

    public void startEngine() {
        super.startEngine();
        System.out.println("Force driver to fasten seat belts.");
    }

    public void refuel(double nr_liters){
        System.out.println("Refueled " + nr_liters + " units of fuel.");
    }
}