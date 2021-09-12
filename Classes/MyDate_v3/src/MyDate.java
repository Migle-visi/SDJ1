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

    public String getAstroSign()
    {
        if ((month == 3 && day >=21) || month == 4 && day <=19)
        {
            return "Aries";
        }
        else if ((month == 4 && day >=20) || month == 5 && day <= 20)
        {
            return "Taurus";
        }
        else if ((month == 5 && day >=21) || month == 6 && day <=20)
        {
            return "Gemini";
        }
        else if ((month == 6 && day >=21) || month == 7 && day <=22)
        {
            return "Cancer";
        }
        else if ((month == 7 && day >= 23) || month == 8 && day <=22)
        {
            return "Leo";
        }
        else if ((month == 8 && day >= 23) || month == 9 && day <=22)
        {
            return "Virgo";
        }
        else if ((month == 9 && day >= 23) || month == 10 && day <=22)
        {
            return "Libra";
        }
        else if ((month == 10 && day >= 23) || month == 11 && day <=21)
        {
            return "Scorpio";
        }
        else if ((month == 11 && day >= 23) || month == 12 && day <= 21)
        {
            return "Sagittarius";
        }
        else if ((month == 12 && day >= 22) || month == 1 && day <=19)
        {
            return "Capricorn";
        }
        else if ((month == 1 && day >= 20) || month == 2 && day <= 18)
        {
            return "Aquarius";
        }
        else if ((month == 2 && day >= 19) || month == 3 && day <=20)
        {
            return "Pisces";
        }

        return null;
    }

    public String getAstroElement()
    {
        if ((month == 3 && day >=21) || month == 4 && day <=19)
        {
            return "Fire sign";
        }
        else if ((month == 7 && day >= 23) || month == 8 && day <=22)
        {
            return "Fire sign";
        }
        else if ((month == 11 && day >= 23) || month == 12 && day <= 21)
        {
            return "Fire sign";
        }
        else if ((month == 4 && day >=20) || month == 5 && day <= 20)
        {
            return "Earth sign";
        }
        else if ((month == 8 && day >= 23) || month == 9 && day <=22)
        {
            return "Earth sign";
        }
        else if ((month == 12 && day >= 22) || month == 1 && day <=19)
        {
            return "Earth sign";
        }
        else if ((month == 6 && day >=21) || month == 7 && day <=22)
        {
            return "Water sign";
        }
        else if ((month == 10 && day >= 23) || month == 11 && day <=21)
        {
            return "Water sign";
        }
        else if ((month == 2 && day >= 19) || month == 3 && day <=20)
        {
            return "Water sign";
        }
        else if ((month == 5 && day >=21) || month == 6 && day <=20)
        {
            return "Air sign";
        }
        else if ((month == 9 && day >= 23) || month == 10 && day <=22)
        {
            return "Air sign";
        }
        else if ((month == 1 && day >= 20) || month == 2 && day <= 18)
        {
            return "Air sign";
        }
        return null;
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
