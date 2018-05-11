package pl.jitsolutions.training.javasetests;

public class Car {

    private String registrationNumber;

    int productionYear;

    private Manufacturer manufacturer;

    String model;

    float engineCapacity;

    long mileage;

    String [] parts;

    int [] inspections;

    private double speed;

    public Car() {
    }

    public Car(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void increaseSpeed() {
        this.speed += 10.0d;
    }

    public void applyBrakes(double brakePower) {
        this.speed -= brakePower;
    }

    public boolean isMoving() {
        if (this.speed > 0) {
            return true;
        }

        return false;
    }

    public boolean isInspectionExists(int year) {
        for (int inspection : inspections) {
            if (year == inspection) {
                return true;
            }
        }

        return false;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public double getSpeed() {
        return speed;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
