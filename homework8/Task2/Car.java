package homework8.Task2;

import java.util.Objects;

public abstract class Car {

    private String brand;
    private String model;
    private int year;
    private String typeOfFuel;
    private String typeOfGearbox;

    public Car(String brand, String model, int year, String typeOfFuel, String typeOfGearbox) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.typeOfFuel = typeOfFuel;
        this.typeOfGearbox = typeOfGearbox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(typeOfFuel, car.typeOfFuel) &&
                Objects.equals(typeOfGearbox, car.typeOfGearbox);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime * brand.hashCode() * model.hashCode() * typeOfGearbox.hashCode() * typeOfFuel.hashCode() * new Integer(year).hashCode();
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + " год выпуска:" + getYear() + " тип топлива " + getTypeOfFuel() + " коробка передач:" + getTypeOfGearbox();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public String getTypeOfGearbox() {
        return typeOfGearbox;
    }
}