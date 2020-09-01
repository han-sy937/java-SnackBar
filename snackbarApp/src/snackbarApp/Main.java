package snackbarApp;

public class Main {
    private static void workWitData() {
        System.out.println("It's working!!!");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        Vendingmachine m1 = new Vendingmachine("Food");
        Snack snack1 = new Snack("Chips", 36, 1.75, m1.id);
        Snack snack2 = new Snack("Chocolate", 36, 1.00, m1.id);
        Snack snack3 = new Snack("Pretzel", 30, 2.00, m1.id);

        Vendingmachine m2 = new Vendingmachine("Drink");
        Snack snack4 = new Snack("Soda", 24, 2.50, m2.id);
        Snack snack5 = new Snack("Water", 20, 2.75, m2.id);

        Vendingmachine m3 = new Vendingmachine("Office");

        // customer1 Jane buys 3 of snack4 (soda)
        c1.buySnacks(snack4.getCost(), 3);
        snack4.buySnacks(3);
        System.out.println(c1.getName() + " cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of snack4 is " + snack4.getQuantity());
        

        // customer1 Jane buys 1 of snack3
        c1.buySnacks(snack3.getCost(), 1);
        snack3.buySnacks(1);
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quantity of snack4 is " + snack3.getQuantity());

        // customer2 Bob buys 2 of snack 4
        c2.buySnacks(snack4.getCost(), 2);
        snack4.buySnacks(2);
        System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
        System.out.println("Quantity of snack4 is " + snack4.getQuantity());

        // customer1 finds $10
        c1.addCash(10);
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());

        // customer1 Jane buys 1 of snack2
        c1.buySnacks(snack2.getCost(), 1);
        snack2.buySnacks(1);
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quantity of snack2 is " + snack2.getQuantity());

        // add 12 more items to snack3
        snack3.addQuantity(12);
        System.out.println("Quantity of snack3 is " + snack3.getQuantity());

        // customer2 Bob buys 3 of snack3
        c2.buySnacks(snack3.getCost(), 3);
        snack3.buySnacks(3);
        System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
        System.out.println("Quantity of snack3 is " + snack3.getQuantity());
    }
    public static void main(String[] args) {
        workWitData();
    }
}