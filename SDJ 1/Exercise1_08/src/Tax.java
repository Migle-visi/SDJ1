// Program calculates the total price of items incl. tax

public class Tax
{
    public static void main(String[] args)
    {
        int item1 = 80, item2 = 140, item3 = 230; // price of items
        double salesTax = 1.25;                  // tax in denmark of 25%

        int sum;
        sum = item1 + item2 + item3;            // calculates the sum of items
                                                // without tax
        double totalPrice;
        totalPrice = sum * salesTax;            // the total price with tax

        System.out.println("Your items are worth of " + sum + "kr");
        System.out.println("In total you have to pay " + totalPrice + "kr");

    }
}
