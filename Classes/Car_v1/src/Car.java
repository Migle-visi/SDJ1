public class Car
{
    private String make;
    private String model;
    private String colour;
    private boolean manualGear;

    public Car(String make, String model, String colour, boolean manualGear)
    {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.manualGear = manualGear;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public String getColour()
    {
        return colour;
    }

    public boolean hasManualGear()
    {
        return manualGear;
    }

    public String toString()
    {
        return make + " " + model + " " + manualGear + " " + colour;
    }
}
