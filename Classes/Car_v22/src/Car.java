public class Car
{
    private String make;
    private String model;
    private String colour;
    private boolean manualGear;
    private Engine engine;

    public Car(String make, String model, boolean manualGear, String colour, Engine engine)
    {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.manualGear = manualGear;
        this.engine = engine;
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

    public Engine getEngine()
    {
        return engine;
    }

    public boolean hasManualGear()
    {
        return manualGear;
    }

    public int getHorsePower()
    {
        return engine.getHorsePower();
    }

    public void setEngine(Engine engine)
    {
        this.engine = engine;
    }

    public String toString()
    {
        return make + " " + model + " " + manualGear + " " + colour + " " + engine;
    }
}
