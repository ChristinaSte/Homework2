package homework8.Task2;

public class Bus extends Car {

    private int seats;

    public Bus(String brand, String model, int year, String typeOfFuel, String typeOfGearbox, int seats) {
        super(brand, model, year, typeOfFuel, typeOfGearbox);
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        Bus bus = (Bus) o;
        return seats == bus.seats;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * seats;
    }

    @Override
    public String toString() {
        return super.toString() + " количество мест:" + getseats();
    }

    public int getseats() {
        return seats;
    }
}