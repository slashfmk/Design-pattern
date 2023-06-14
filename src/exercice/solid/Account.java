package exercice.solid;

public class Account {

    private double balance;
    private String name;
    private String password;

    public Account(double balance, String name, String password) {
        this.balance = balance;
        this.name = name;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
