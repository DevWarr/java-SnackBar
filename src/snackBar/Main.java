package snackBar;

public class Main
{
    public static void main(String[] args)
    {

        // Instantiate objects
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, vm1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, vm1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, vm1.getId());
        
        Snack s4 = new Snack("Soda", 24, 2.50, vm2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, vm2.getId());

        // Display Vanding Machines and snacks within
        System.out.println("Inside the " + vm1.getName() + " vending machine:");
        System.out.println(s1.snackInfo());
        System.out.println(s2.snackInfo());
        System.out.println(s3.snackInfo());
        System.out.println("\n");
        System.out.println("Inside the " + vm2.getName() + " vending machine:");
        System.out.println(s4.snackInfo());
        System.out.println(s5.snackInfo());
        System.out.println("\n");
        System.out.println("Inside the " + vm3.getName() + " vending machine:");
        System.out.println("***NO SNACKS***\n\n");

        // Display Customer Info
        System.out.println(c1.info());
        System.out.println(c2.info());
        System.out.println("\n");

        // Processing as requested by MVP
        System.out.println(c1.buySnack(s4, 3));
        System.out.println(c1.buySnack(s3, 1));
        System.out.println(c2.buySnack(s4, 2));
        System.out.println(c1.getName() + " finds $10!");
        c1.addCash(10.0);
        System.out.println(c1.info() + "\n");
        System.out.println(c1.buySnack(s2, 1));
        s3.addQuantity(12);
        System.out.println("12 of " + s3.getName() + " were added.\nThere are now " + s3.getQuantity() + " of " + s3.getName() + ".\n");
        System.out.println(c2.buySnack(s3, 3));

        // Extra processing
        System.out.println(c2.buySnack(s4, 50));
        s2.addQuantity(200);
        System.out.println("200 of " + s2.getName() + " were added.\nThere are now " + s2.getQuantity() + " of " + s2.getName() + ".\n");
        System.out.println(c2.buySnack(s2, 50));
    }
}