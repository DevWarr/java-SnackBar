package snackBar;

public class Main
{
    public static void main(String[] args)
    {

        // instantiate objects
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, 1);
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
        
        Snack s4 = new Snack("Soda", 24, 2.50, 2);
        Snack s5 = new Snack("Water", 20, 2.75, 2);

        System.out.println("Inside the " + vm1.getName() + " vending machine:");
        System.out.println(s1.snackInfo());
        System.out.println(s2.snackInfo());
        System.out.println(s3.snackInfo());
        System.out.println("\n");
        System.out.println("Inside the " + vm2.getName() + " vending machine:");
        System.out.println(s4.snackInfo());
        System.out.println(s5.snackInfo());
        System.out.println("\n");
    }
}