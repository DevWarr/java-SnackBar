package snackBar;

public class Snack
{
    private static int maxId = 0; // Stores current maximum id, incremented and used to set id of a new object
    private int id; // Id value of Snack
    private String name; // Name of Snack
    private int quantity; // Quanity of Snack
    private double cost; // Cost of Snack (double)
    private int vendingMachineId; // id of Vending Machine that holds the snack

    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
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

    // get and set cost
    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    // get total cost, given a quanity
    public double getTotalCost(int quantity)
    {
        return cost*quantity;
    }

    // get and set vendingMachineId
    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    // get and add quantity
    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }

    // buy snack(s)
    public double buySnack(double cash, int quantity)
    {
        if (!(this.quantity > quantity))
        {
            return result = -1; // Error code: Not enough snacks to purchase
        }
        if (!(cash > cost*quantity))
        {
            return result = -2; // Error code: Not enough cash to purchase
        }
        this.quantity -= quantity; // Set our new auntity of snacks
        return cost*quantity; // Return how much the purchase cost.
    }
}