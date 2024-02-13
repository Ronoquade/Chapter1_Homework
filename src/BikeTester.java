import java.util.ArrayList;

public class BikeTester {
    public static void main(String[] args) {
        // Creating bike1 with no-arg constructor object and using toString method to print details
        Bike bike1 = new Bike();
        System.out.println(bike1);

        // Creating bike2 object, changing a couple of attributes, and using toString method to print details
        Bike bike2 = new Bike();
        bike2.setManufacturer("Ultrix");
        bike2.setYear(2024);
        System.out.println(bike2);

        // Creating Bike arrayList, adding the two objects, and printing the arrayList
        ArrayList<Bike> bikeList = new ArrayList<Bike>();
        bikeList.add(bike1);
        bikeList.add(bike2);
        System.out.println(bikeList);

        // Finding the total number of wheels of all bikes in bikeList
        int sum = 0;
        for (int i = 0; i < bikeList.size(); i++) {
            sum += bikeList.get(i).getNumberOfWheels();
        }
        System.out.println("Total number of wheels in bikeList: " + sum);

        // Finding the oldest bike in bikeList
        int min = bikeList.get(0).getYear();
        for (int i = 1; i < bikeList.size(); i++) {
            if (bikeList.get(i).getYear() < min) {
                min = bikeList.get(i).getYear();
            }
        }
        System.out.println("Year of the oldest bike in bikeList: " + min);
    }
}
