package workshop.introMVC.repository;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import workshop.introMVC.model.Portfolio;
import workshop.introMVC.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    @PostConstruct
    public void init() {        // Our "database" of users
        users.add(new User("123@gmail.com", "123", null));
        users.add(new User("jared@gmail.com", "123", null));
        users.add(new User("nabil@gmail.com", "123", null));
        users.add(new User("matt@gmail.com", "123", null));
        users.add(new User("gianluca@gmail.com", "123", null));
    }

    public void updateEmail(User user, String newEmail) {
        user.setEmail(newEmail);
    }

    public void updatePassword(User user, String password) {
        user.setPassword(password);
    }

    public User assignPortfolio(User user, Portfolio portfolio) { 
        if (user.getPortfolio() == null) {
            user.setPortfolio(portfolio);
            return user;
        } else {
            return null;
        }
    }

    public User addUser(User user) {
        for (User u : users) {
            if (u.getEmail().equals(user.getEmail())) {
                return null;
            }
        }
        users.add(user);
        return user;
    }

    public User getUser(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public User deleteUser(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                users.remove(user);
                return user;
            }
        }
        return null;
    }

}
