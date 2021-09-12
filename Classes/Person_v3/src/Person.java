public class Person
{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, char gender)
    {
        this(name,0,gender);
    }

    public Person(char gender)
    {
        this(null,0, gender);
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public char getGender()
    {
        return gender;
    }

    public String getAgeStatus()
    {
        if (age < 0)
            return "Error";
        else if (0 < age && age <=12)
            return "Child";
        else if (12 < age && age <=19)
            return "Teenager";
        else if (19 < age && age <= 65)
            return "Adult";
        else
            return "Senior citizen";

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }

    public String getStatus()
    {
        if (age<0)
            return "Error";
        else if (age >= 18 && (gender == 'M' || gender == 'm'))
            return "Man";
        else if (age <= 18 && (gender == 'M' || gender == 'm'))
            return "Boy";
        else if (age >= 18 && (gender == 'F' || gender == 'f'))
            return "Woman";
        else return "Girl";
    }

    public String toString()
    {
        return name + " " + age + " " +gender;
    }
}
