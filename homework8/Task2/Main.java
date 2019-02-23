package homework8.Task2;

public class Main {

    public static void main(String[] args) {
        Car VitoLong = new Bus("Mercedes", "Vito", 2005, "diesel", "automat", 9);
        Car T5 = new Bus("Volksvagen", "T5 Shuttle", 2006, "pertol", "mechanical", 9);
        Car T4 = new Truck("Volksvagen", "Transporter T4", 2000, "pertol", "mechanical", 700);
        Car Transit = new Truck("Ford", "Transit", 2000, "diesel", "mechanical", 650);
        Car B6 = new Sedan("Mazda", "6", 2015, "pertol", "automat", "middle");
        Car Logan = new Sedan("Renault", "Logan", 2006, "pertol", "mechanical", "economy");
        Car Xc = new SUV("Volvo", "S90", 2018, "pertol", "automat", 25);
        Car X = new SUV("BMW", "X6", 2011, "diesel", "automat", 27);

        Garage garage = new Garage();

        garage.parking(VitoLong);
        garage.parking(T5);
        garage.parking(T5);
        garage.parking(T5);
        garage.parking(T5);
        garage.parking(T5);
        garage.parking(T4);
        garage.parking(Transit);
        garage.parking(B6);
        garage.parking(Logan);
        garage.parking(Xc);
        garage.parking(X);

        System.out.println(garage.exitCar(T5));
        System.out.println(garage.exitCar(T5));
        System.out.println(garage.exitCar(X));
        System.out.println(garage.exitCar(X));
        System.out.println(garage.numberOfTypeAutoInGarage(T5));
    }
}
