public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        set(day, month, year);
    }

    public void set(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear()
    {
        return this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0);

    }

    public String getMonthName()
    {
        switch (month)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "November";
            case 11:
                return "October";
            case 12:
                return "December";
            default:
                return null;
        }
    }

    public void stepForwardOneDay()
    {
        day++;
        if (day > 31)
        {
            day = 1;
            month++;
            if (month > 12)
            {
                month = 1;
                year++;
            }
        }
    }

    public int numberOfDaysInMonth() {
        if (month == 2 && this.isLeapYear())
        {
            return 29;
        }
        else if (month == 2 && !this.isLeapYear())
        {
            return 28;

        }
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            return 30;
        }
        else
        {
            return 31;
        }

    }

    public boolean isBefore(MyDate date) {
        return this.numberOfDaysInMonth() < date.numberOfDaysInMonth();
    }

    public String toString()
    {
        String s = "";
        if (day<10)
        {
            s += "0";
        }
        s += day;
        s += "";
        if (month <10)
        {
            s += "0";
        }
        s += +month;
        s += "/" + year;

        return s;
    }
}
