
public class Circle
{
    public static void main(String[] args)
    {
        double radius = 22.5;
        double circumference, area;

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.printf("If radius is " + radius + " ,then the circumference is "
                            + "%.2f\n", circumference);
        System.out.printf("If radius is " + radius +
                            " ,then the area of a circle is " + "%.2f\n", area);
    }
}
