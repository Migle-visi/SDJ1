public class Address
{
    private String town, street, door;
    private int number, floor;
    private char letter;

    public Address(String town, String street, int number, char letter, int floor, String door)
    {
        this.town = town;
        this.street = street;
        this.number = number;
        this.letter = letter;
        this.floor = floor;
        this.door = door;
    }

    public String getFullNumber()
    {
        return number + " " + floor + " " + door + " " + letter;
    }

    public String toString()
    {
        return " " + street + this.getFullNumber() + " " + town;
    }

}
