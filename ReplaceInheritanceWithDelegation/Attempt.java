package ReplaceInheritanceWithDelegation;

class Engine {
    // ...
    private double fuel;
    private double CV;

    private double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel  = fuel;
    }

    public double getCV() {
        return CV;
    }

    public void setCV(double cv) {
        this.CV = cv;
    }
}

class Car {
    // ...
    private String brand;
    private String model;
    private Engine engine

    public String getName() {
        return brand + " " + model + " (" +  engine.getCV() + "CV)";
    }

    public String getMode() {
        return model;
    }

    public void setModel(String mode) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) { 
        this.brand = brand;
    }
}
