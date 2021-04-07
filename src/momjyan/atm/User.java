package momjyan.atm;

public class User {

    /**
     * The first name of user.
     */
    private String firstName;

    /**
     * The last name of user.
     */
    private String lastName;

    /**
     * The unique user ID of the user
     */
    private String uniqueUserID;

    /**
     * The password of user
     */
    private byte password;


    /**
     * The array for accounts for every user
     */
    private int[] accounts;


    public User(String firstName, String lastName, String uniqueUserID, byte password) {
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.uniqueUserID = uniqueUserID;
        this.password   = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUniqueUserID() {
        return uniqueUserID;
    }

    public byte getPassword() {
        return password;
    }

    public int[] getAccounts() {
        return accounts;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUniqueUserID(String uniqueUserID) {
        this.uniqueUserID = uniqueUserID;
    }

    public void setPassword(byte password) {
        this.password = password;
    }

    public void setAccounts(int[] accounts) {
        this.accounts = accounts;
    }
}
