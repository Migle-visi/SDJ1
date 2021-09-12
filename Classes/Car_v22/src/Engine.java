public class Engine
{
    private String type;
    private int horsePower;
    private int volume;
    private boolean isDiesel;

    public Engine(String type, int horsePower, int volume, boolean isDiesel)
    {
        this.type = type;
        this.horsePower = horsePower;
        this.volume = volume;
        this.isDiesel = isDiesel;
    }

    public Engine(String type, int horsePower, int volume)
    {
        this.type = type;
        this.horsePower = horsePower;
        this.volume = volume;
        isDiesel = true;
    }

    public String getType()
    {
        return type;
    }
    public int getHorsePower()
    {
        return horsePower;
    }
    public int getVolume()
    {
        return volume;
    }
    public boolean isDiesel()
    {
        return isDiesel;
    }

    public String toString()
    {
        return "\nType = " + type + "\nHorsepower = " + horsePower + "\nVolume in m3 = " + volume
           + "\nisDiesel = " + isDiesel;
    }

}
