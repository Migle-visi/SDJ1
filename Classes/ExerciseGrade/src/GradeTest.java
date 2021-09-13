import java.util.Scanner;

public class GradeTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Grade gr1 = new Grade(10);
        Grade gr2 = new Grade("C");

        System.out.println("Tom got grade " + gr1.getGrade());
        System.out.println("Josh got grade " + gr2.getGrade());
        System.out.println("Tom's grade translated to ECTS is: " + gr1.getEctsGrade());
        System.out.println("Josh's grade translated to ECTS is: " + gr2.getEctsGrade());

        System.out.println("Full version of Tom's grade: " + gr1);
        System.out.println("Full version of Josh's grade: " + gr2);

        if (gr1.getGrade() > gr2.getGrade())
        {
            System.out.println("Tom is smarter than Josh");
        }
        else if (gr1.getGrade() == gr2.getGrade())
        {
            System.out.println("Both are smart bois.");
        }
        else
        {
            System.out.println("Josh is smarter than Tom");
        }

    }
}
