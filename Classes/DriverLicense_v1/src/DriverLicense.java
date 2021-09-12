public class DriverLicense
{
    private int number;
    private boolean permitForTruck, permitForBus;

    public DriverLicense(int number, boolean permitForBus, boolean permitForTruck)
    {
        this.number = number;
        this.permitForBus = permitForBus;
        this.permitForTruck = permitForTruck;

    }
    public DriverLicense(int number, boolean truckAndBus){
        this.number = number;
        this.permitForBus = truckAndBus;
        this.permitForTruck = truckAndBus;

    }

    public DriverLicense(int number){
        this.number = number;
    }

    public int getNumber()
    {
        return number;
    }

    public boolean getPermitForDrivingTruck()
    {
        return permitForTruck;
    }
    public boolean getPermitForDrivingBus()
    {
        return permitForBus;
    }

    public String toString()
    {
        return "License Nr. and permission: " + number + "\nPermission to drive Bus: " + permitForBus + "\nPermission to drive Truck:  " + permitForTruck;
    }
}
