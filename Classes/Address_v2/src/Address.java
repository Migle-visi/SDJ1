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
        if (letter == ' ')
        {
            this.letter = '-';
        }
        else
        {
            this.letter = letter;
        }
        if (floor <= 0)
        {
            this.floor = Integer.MIN_VALUE;
        }
        else
        {
            this.floor = floor;
        }
        if (door == null)
        {
            this.door = " ";
        }
        else
        {
            this.door = door;
        }
    }
    public Address (String town, String street, int number, char letter, int floor)
    {
        this.town = town;
        this.street = street;
        this.number = number;
        if (letter == ' ')
        {
            this.letter = '-';
        }
        else
        {
            this.letter = letter;
        }
        if (floor <= 0)
        {
            this.floor = Integer.MIN_VALUE;
        }
        else
        {
            this.floor = floor;
        }

    }

    public Address (String town, String street, int number, int floor, String door)
    {
        this.town = town;
        this.street = street;
        this.number = number;
        if (floor <= 0)
        {
            this.floor = Integer.MIN_VALUE;
        }
        else
        {
            this.floor = floor;
        }
        if (door == null)
        {
            this.door = " ";
        }
        else
        {
            this.door = door;
        }
    }
    public Address (String town, String street, int number, int floor)
    {
        this.town = town;
        this.street = street;
        this.number = number;
        if (floor <= 0)
        {
            this.floor = Integer.MIN_VALUE;
        }
        else
        {
            this.floor = floor;
        }
    }
    public Address (String town, String street, int number)
    {
        this.town = town;
        this.street = street;
        this.number = number;
    }
    public Address (String town, String street, int number, char letter)
    {
        this.town = town;
        this.street = street;
        this.number = number;
        if (letter == ' ')
        {
            this.letter = '-';
        }
        else
        {
            this.letter = letter;
        }
    }
    public Address (String town, String street, int number, char letter, String door)
    {
        this.town = town;
        this.street = street;
        this.number = number;
        if (letter == ' ')
        {
            this.letter = '-';
        }
        else
        {
            this.letter = letter;
        }
        if (door == null)
        {
            this.door = " ";
        }
        else
        {
            this.door = door;
        }
    }
    public Address (String town, String street, int number, String door)
    {
        this.town = town;
        this.street = street;
        this.number = number;
        if (door == null)
        {
            this.door = " ";
        }
        else
        {
            this.door = door;
        }
    }

    public String getTown()
    {
        return town;
    }

    public String getStreet()
    {
        return street;
    }

    public int getNumber()
    {
        return number;
    }

    public char getLetter()
    {
        return letter;
    }

    public int getFloor()
    {
        return floor;
    }

    public String getDoor()
    {
        return door;
    }

    public boolean isApartment()
    {
        if (floor != Integer.MIN_VALUE)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String getFullNumber()
    {
        String s = "";
        s += number;
        s += " , ";
        if (letter == '-')
        {
            s +=" ";
        }
        else
        {
            s += letter;
            s += " , ";
        }

        if (!isApartment())
        {
            s += " ";
        }
        else
        {
            s += floor;
            s += " , ";
        }
        s += door;

        return s;
    }

    public String toString()
    {
        return town + " , " + street + " , " + this.getFullNumber();
    }

}
