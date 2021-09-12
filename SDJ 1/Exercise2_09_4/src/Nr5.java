// Exercise from book pg.148 nr 16

public class Nr5
{
    public static void main(String[] args)
    {
        int customers = 15000;
        double purchaseDrinks = 0.18;  // 18% bought one or more of energy drinks

        double totalPurchasedDrinks = customers * purchaseDrinks; // find out how many of 15000 bought them

        double citrusEnergyDrink = totalPurchasedDrinks * 0.58;  //58% preferred citrus, find out how many people it is

        System.out.println(+ totalPurchasedDrinks + " people purchased one or more energy drinks per week.");
        System.out.println(+ citrusEnergyDrink + " of them preferred a citrus energy drink.");


    }
}
