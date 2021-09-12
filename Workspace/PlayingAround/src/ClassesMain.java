public class ClassesMain
{
    public static void main(String[] args)
    {
        Car ferrari = new Car(); // creating an object and assigning values
        ferrari.model = "ferrari F340";
        ferrari.seats = 4;
        ferrari.color = "Red";

        // calling the voi method

        ferrari.display();

        //creating new object

        Car tesla = new Car();
        tesla.model = "Model S";
        tesla.seats = 4;
        tesla.color = "Black";

        // calling the void method

        tesla.display();

        //creating another car

        Car audi = new Car();
        audi.model = "Audi SQ5";
        audi.seats = 4;
        audi.color = "Blue";
        audi.display();


    }
}
