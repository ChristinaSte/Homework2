package homework8.Task2;

public class SUV extends Car {

    private int groundClearance;

    public SUV(String brand, String model, int year, String typeOfFuel, String typeOfGearbox, int groundClearance) {
        super(brand, model, year, typeOfFuel, typeOfGearbox);
        this.groundClearance = groundClearance;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        SUV suv = (SUV) o;
        return groundClearance == suv.groundClearance;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * groundClearance;
    }

    public int getgroundClearance() {
        return groundClearance;
    }
}