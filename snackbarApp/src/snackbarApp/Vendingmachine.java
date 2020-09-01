package snackbarApp;

public class Vendingmachine {
    // (know)
    public static int maxId = 0;
    public int id;
    public String name;

    // (can)
    public Vendingmachine(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
}