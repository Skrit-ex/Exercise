package by.validation;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {


    private final List<User> users = new ArrayList<>();

    public void save(User user){
        if(user.getName().equals("admin")){
            throw new RuntimeException(" Admin exist!");
        }
        users.add(user);
    }
}
