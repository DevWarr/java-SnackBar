package snackBar;

public class Customer
{
    private static int maxId = 0; // Stores current maximum id, incremented and used to set id of a new object
    private int id; // id of customer
    private String name; // name of customer
    private double cash = 0; // cash the customer has 

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    // get and set name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // get and add cash
    public double getCash()
    {
        return cash;
    }

    public void addCash(double cash)
    {
        this.cash = cash;
    }

    // buy a specified snack, if theycustomer has enough cash
    public buySnack(Class snack, int quantity)
    {
        snack.buySnack()
    }
}