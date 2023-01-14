package General;

public class Account {


    private String name;
    private int number;
    private Double balance;

    public Account(){

    }

    public Account(String name, int number, Double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
