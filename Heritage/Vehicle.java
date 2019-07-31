public abstract class Vehicle {

    private String brand;
    private int kilometers;

    public Vehicle(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    // Getter
    public String getBrand() {
        return brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    // Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();
}