package by.tms;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {

    private final List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }
}
