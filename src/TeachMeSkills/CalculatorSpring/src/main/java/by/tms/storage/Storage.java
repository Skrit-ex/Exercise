package by.tms.storage;

import by.tms.User;

import java.util.Optional;

public interface Storage {

    void save(User user);

    Optional<User> findByEmail(String email);

    boolean checkUsername(String username);


}
