package snackBar;

public class VendingMachine
{
    private static int maxId = 0; // Stores current maximum id, incremented and used to set id of a new object
    private int id; // id of vending maching
    private String name; // name of vending machine

    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
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
}