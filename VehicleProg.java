public class VehicleProg {

    public VehicleProg(){

        Vehicle miniVan = new Vehicle();
        Vehicle sportsCar = new Vehicle();

        //zadanie 11

        //miniVan.passengers = 6;
        //miniVan.fuelcap = 80;
        //miniVan.lkm = 8.78f;

        //sportsCar.passengers = 2;
        //sportsCar.fuelcap = 55;
        //sportsCar.lkm = 15.87f;



        //zadanie 12

        miniVan.setPassengers(6);
        miniVan.setFuelcap(80);
        miniVan.setLkm(8.78f);

        sportsCar.setPassengers(2);
        sportsCar.setFuelcap(55);
        sportsCar.setLkm(15.87f);

        //zadanie 11
        //System.out.println("Minivan przewozi " + miniVan.passengers + " osób. Spalanie wynosi " + miniVan.lkm + " l/100km.");
        //System.out.println("Zasięg minivana jest równy " + ((int) ((miniVan.fuelcap / miniVan.lkm) * 100)) + " km.");
        //System.out.println("Auto sportowe przewozi " + sportsCar.passengers + " osób. Spalanie wynosi " + sportsCar.lkm + " l/100km.");
        //System.out.println("Zasięg auta sportowego jest równy " + ((int) ((sportsCar.fuelcap / sportsCar.lkm) * 100)) + " km.");

        //zadanie 12
        //miniVan.rangeZadanie12();
        //sportsCar.rangeZadanie12();

        //zadanie 13
        System.out.println("Minivan przewozi " + miniVan.getPassengers() + " osób na odległość do " + miniVan.range() + " km.");
        System.out.println("Auto sportowe przewozi " + sportsCar.getPassengers() + " osób na odległość do " + sportsCar.range() + " km.");

        //zadanie15
        System.out.print("Minivan ");
        miniVan.fuelCalculator(478);
        System.out.print("Auto sportowe ");
        sportsCar.fuelCalculator(478);

    }

}
