package snackbarApp;

public class Customer {
    // (know)
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    // (can)
    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    // setter 
    public void setName(String name) {
        this.name = name;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    // other methods
    public void addCash(double cash) {
        setCashOnHand(this.cashOnHand + cash);;
    }

    public void buySnacks(double cost, int amount) {
        setCashOnHand(this.cashOnHand - (cost * amount));
    }
}