public class Vehicle {

    //zadanie 11
    //protected int passengers;
    //protected int fuelcap;
    //protected float lkm;

    //zadanie 12
    private int passengers;
    private int fuelcap;
    private float lkm;

    public void setPassengers(int newPassengers){
        this.passengers = newPassengers;
    }

    public int getPassengers(){
        return passengers;
    }

    public void setFuelcap(int newFuelcap){
        this.fuelcap = newFuelcap;
    }

    public int getFuelcap(){
        return fuelcap;
    }

    public void setLkm(float newLkm){
        this.lkm = newLkm;
    }

    public float getLkm(){
        return lkm;
    }

    public void rangeZadanie12(){
        int range = ((int) ((this.fuelcap / this.lkm) * 100));
        System.out.println("Zasięg (km): " + range);
    }

    public int range(){
        return (int) ((this.fuelcap / this.lkm) * 100);
    }

    private float fuelConsumptionPerDistance(int distance){
        return (float) (Math.round(((this.lkm / 100) * distance) * 100.0) / 100.0);
    }

    public void fuelCalculator(int fuelDistance){
        System.out.println("potrzebuje " + this.fuelConsumptionPerDistance(fuelDistance) + " litrów paliwa na przejechanie " + fuelDistance + "km.");
    }

}
