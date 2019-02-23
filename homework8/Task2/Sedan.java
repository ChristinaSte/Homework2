package homework8.Task2;

public class Sedan extends Car {

    private String classAuto;

    public Sedan(String brand, String model, int year, String typeOfFuel, String typeOfGearbox, String classAuto) {
        super(brand, model, year, typeOfFuel, typeOfGearbox);
        this.classAuto = classAuto;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) {
            return false;
        }
        Sedan sedan = (Sedan) o;
        return classAuto.equals(sedan.classAuto);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * classAuto.hashCode();
    }

    public String getClassAuto() {
        return classAuto;
    }
}
