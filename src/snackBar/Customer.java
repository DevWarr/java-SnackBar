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

    // get and set id
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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
        this.cash += cash;
    }

    public String info() 
    {
        return name + " has $" + cash + " to spend.";
    }

    // buy a specified snack, if theycustomer has enough cash
    public String buySnack(Snack snack, int quantity)
    {
        double cost = snack.buySnack(cash, quantity);
        String result = name + " goes to buy " + quantity + " of " + snack.getName() + ", for a total cost of $" + snack.getTotalCost(quantity) + ".\n";
        // error handling
        if (cost == -1)
        {
            return result += "There are not enough snacks to buy.\n";
        }
        if (cost == -2)
        {
            return result += name + " does not have enough cash to buy " + quantity + " of " + snack.getName() + ".\n";
        }

        // if successful
        cash -= cost;
        return result += "Transaction successful.\n" + name + " now has $" + cash + ".\nThere are now " + snack.getQuantity() + " of " + snack.getName() + ".\n";
    }
}