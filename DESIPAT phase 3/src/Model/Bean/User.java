package Model.Bean;

public class User {
    
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String username;
    protected String password;
    
    protected String[] userColumns;
    
    public User() { }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*
     * Getters/Setters
     */
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String[] getUserColumns() {
        return userColumns;
    }
    public void setUserColumns(String[] userColumns) {
        this.userColumns = userColumns;
    }

}
