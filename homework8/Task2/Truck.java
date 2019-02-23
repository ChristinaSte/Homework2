package homework8.Task2;

public class Truck extends Car {

    private int MaxCarryingCapacityInKg;

    public Truck(String brand, String model, int year, String typeOfFuel, String typeOfGearbox, int maxCarryingCapacity) {
        super(brand, model, year, typeOfFuel, typeOfGearbox);
        MaxCarryingCapacityInKg = maxCarryingCapacity;
    }
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        Truck truck = (Truck) o;
        return MaxCarryingCapacityInKg == truck.MaxCarryingCapacityInKg;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * MaxCarryingCapacityInKg;
    }

    public int getMaxCarryingCapacity() {
        return MaxCarryingCapacityInKg;
    }
}