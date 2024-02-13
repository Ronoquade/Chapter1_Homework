public class Bike {
    private int numberOfWheels;
    private String manufacturer;
    private int year;
    public Bike() {
        numberOfWheels = 2;
        manufacturer = "Schwinn";
        year = 2014;
    }

    public Bike(int numberOfWheels, String manufacturer, int year) {
        this.numberOfWheels = numberOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }
    public String toString() {
        return "Bike Details \n\nNumber of Wheels: " + numberOfWheels + "\nManufacturer: " + manufacturer + "\nYear: " + year + "\n";
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
