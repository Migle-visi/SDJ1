//Exercise from book pg 147 exercise 14

public class Nr4
{
    public static void main(String[] args)
    {
        int shares = 1000;
        double stockPrice = 25.5;
        double commission = 1.02;
        double total = shares * stockPrice * commission;

        System.out.println("The price of one stock is $" + stockPrice);
        System.out.println("The commission for transaction costs: " + commission);
        System.out.println("The total amount you have to pay is $" + total);
    }
}
