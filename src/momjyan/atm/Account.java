package momjyan.atm;

public class Account {

    /**
     * The owner of this account
     */
    private User holder;

    /**
     * The name of account
     */
    private String name;

    /**
     * The account unique ID number
     */
    private String uuid;

    /**
     * The current balance of an account
     */
    private double balance;

    /**
     *  The list of transactions for this account
     */
    private int[] transactions;

    public Account(User holder, String name, String uuid, double balance, int[] transactions) {
        this.holder = holder;
        this.name = name;
        this.uuid = uuid;
        this.balance = balance;
        this.transactions = transactions;
    }

    public User getHolder() {
        return holder;
    }

    public String getName() {
        return name;
    }

    public String getUuid() {
        return uuid;
    }

    public double getBalance() {
        return balance;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactions(int[] transactions) {
        this.transactions = transactions;
    }
}
