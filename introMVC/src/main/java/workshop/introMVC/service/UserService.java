package workshop.introMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import workshop.introMVC.model.Portfolio;
import workshop.introMVC.model.User;
import workshop.introMVC.repository.UserRepository;

@Service
public class UserService {

    @Autowired 
    private UserRepository userRepository;
    
    public User updateEmail(String oldEmail, String newEmail) {
        User user = userRepository.getUser(oldEmail);
        if (user == null) {
            return null;
        } else {
            userRepository.updateEmail(user, newEmail);
            return user;
        }
    }

    public User updatePassword(String email, String password) {
        User user = userRepository.getUser(email);
        if (user == null) {
            return null;
        } else {
            userRepository.updatePassword(user, password);
            return user;
        }
    }

    public User assignPortfolio(String email, Portfolio portfolio) {
        User user = userRepository.getUser(email);
        if (user == null) {
            return null;
        } else {
            userRepository.assignPortfolio(user, portfolio);
            return user;
        }
    }

    public User addUser(String email, String password, Portfolio portfolio) {
        User user = new User(email, password, portfolio);
        userRepository.addUser(user);
        return user;
    }

    public User getUser(String email) {
        return userRepository.getUser(email);
    }

    public User deleteUser(String email) {
        return userRepository.deleteUser(email);
    }
}
