import java.util.ArrayList;
import java.util.List;

/*

    All code is used for educational purposes only

 */
public class Main {
    private static ArrayList<Vehicle> allVehicles = new ArrayList<>();
//    private static int milesPerGallon = 20;
//    private static int odometer = 0;
//    private static double gallonsOfGas = 10.0;

//    private static int[] milesPerGallon = {10, 20, 40};
//    private static double[] gallonsOfGas = {10.0, 12, 6};
//    private static int[] odometer = {0, 1000, 10000};
    public static void main(String[] args) {
        System.out.println("Hello!");

        Vehicle myVehicle = new Vehicle(); //first vehicle
        myVehicle.setMilesPerGallon(20);
        myVehicle.setGallonsOfGas(10);
        myVehicle.setOdometer(0);
        allVehicles.add(myVehicle);

        Vehicle yourVehicle = new Vehicle(); //second vehicle
        yourVehicle.setMilesPerGallon(20);
        yourVehicle.setGallonsOfGas(12);
        yourVehicle.setOdometer(1000);
        allVehicles.add(yourVehicle);

        Vehicle ourVehicle = new Vehicle(); //Third vehicle
        ourVehicle.setMilesPerGallon(40);
        ourVehicle.setGallonsOfGas(6);
        ourVehicle.setOdometer(10000);
        allVehicles.add(ourVehicle);

        int milesDriven = 100;
        drive(milesDriven);

        milesDriven = 60;
        drive(milesDriven);

        drive(90);
    }

    private static void drive(int milesDriven) {
        for (Vehicle vehicle: allVehicles) { //Go through each vehicle in our collection of vehicles
//            vehicle.setGallonsOfGas(vehicle.getGallonsOfGas() - (milesDriven / vehicle.getMilesPerGallon())); // same as -= (milesdriven/milespergallon)
//            vehicle.setOdometer(vehicle.getOdometer() + milesDriven); //same as += shorthand method
            vehicle.go(milesDriven);
            System.out.println("The vehicle is: " + vehicle);
            System.out.println("Odometer: " + vehicle.getOdometer());
            System.out.println("Gallons of gas: " + vehicle.getGallonsOfGas());
            System.out.println("\n");
        }
    }
}