public class MyDate
{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year)
    {
        set(day, month, year);
    }

    public MyDate(int totalNumberOfDays)
    {
        set(totalNumberOfDays);
    }

    public void set(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getNumberOfDays()
    {
        return year * 365 + month * 30 + day;
    }

    public void set(int totalNumberOfDays)
    {
        if (totalNumberOfDays<0 || totalNumberOfDays>364)
        {
            totalNumberOfDays = 0;
        }
        this.year = totalNumberOfDays / 365;
        this.month = (totalNumberOfDays % 365) / 30;
        this.day = (totalNumberOfDays % 365) % 30;
    }

    public int setYear()
    {
        return year;
    }

    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}
