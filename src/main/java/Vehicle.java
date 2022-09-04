public class Vehicle {

    private int milesPerGallon = 20;
    private int odometer = 0;
    private double gallonsOfGas = 10.0;


    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    public void go(int milesDriven) {
        setGallonsOfGas(getGallonsOfGas() - (milesDriven / getMilesPerGallon())); // same as -= (milesdriven/milespergallon)
        setOdometer(getOdometer() + milesDriven); //same as += shorthand method
    }
}
