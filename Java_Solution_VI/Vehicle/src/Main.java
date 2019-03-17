class Main {
    public static void main(String args[]) {
        Vehicle v = new Vehicle("muscles", 2);      //tworzenie obiektu vehicle
        Vehicle v1 = new Car("electric");
        Car c = new Car("internal combustion");

        v.startEngine();
        System.out.println();
        v1.startEngine();
        System.out.println();
//        v1.refuel(5); // blad
        ((Car)v1).refuel(5);

        System.out.println();
        c.startEngine();
        System.out.println();

        if (v1 instanceof Car) {
            Car c1 = (Car) v1;
            c1.startEngine();
            c1.refuel(7);
        }

        System.out.println();
        Vehicle v2 = c;
        System.out.println();
//         v2.refuel(5);  // blad
        ((Car)v2).refuel(10);
    }
}
//w klasie dziedziczonej możemy rozszerzać funkcje
//klasę możemy wzbogacać innymi wlasciwosciami
//rzutowanie w górę i rzutowanie w doł???