public class Grade
{
    private int grade;

    public Grade(int grade)
    {
        if (grade !=12 && grade !=10 && grade !=7 && grade !=4 && grade !=2 && grade !=0 && grade !=-3)
        {
            grade = -3;
        }
        this.grade = grade;
    }

    public Grade(String ectsGrade)
    {
        if (!ectsGrade.equals("A") && !ectsGrade.equals("B") && !ectsGrade.equals("C") && !ectsGrade.equals("D") && !ectsGrade.equals("E") && !ectsGrade.equals("F")&& !ectsGrade.equals("Fx"))
        {
            ectsGrade = "F";
        }
        switch (ectsGrade)
        {
            case "A":
                this.grade = 12;
                break;
            case "B":
                this.grade = 10;
                break;
            case "C":
                this.grade = 7;
                break;
            case "D":
                this.grade = 4;
                break;
            case "E":
                this.grade = 2;
                break;
            case "Fx":
                this.grade = 0;
                break;
            case "F":
                this.grade = -3;
                break;

        }
    }

    public int getGrade()
    {
       return grade;
    }

    public String getEctsGrade()
    {
        switch(this.grade)
        {
            case -3:
                return "F";
            case 0:
                return "Fx";
            case 2:
                return "E";
            case 4:
                return "D";
            case 7:
                return "C";
            case 10:
                return "B";
            default:
                return "A";

        }
    }

    public String toString()
    {
        return this.grade + " " + this.getEctsGrade();
    }

}
