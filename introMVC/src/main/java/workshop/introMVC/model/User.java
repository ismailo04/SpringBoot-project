package workshop.introMVC.model;

import lombok.NonNull;

public class User {

    @NonNull                // Lombok annotation that will check if field is null upon creation
    private String email;   // No need for id in user as email is unique

    @NonNull
    private String password;

    private Portfolio portfolio;

    public User() {
    }

    public User(String email, String password, Portfolio portfolio) {
        this.email = email;
        this.password = password;
        this.portfolio = portfolio;
    }

    // Getter method used to retrieve email of User object (because email is private)
    public String getEmail() {
        return email;
    }

    // Getter method used to change email of User object (because email is private)
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    

    
}
