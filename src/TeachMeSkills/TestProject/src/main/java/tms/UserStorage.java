package tms;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.sql.*;


@Component
@ComponentScan (basePackages = "tms.until")
public class UserStorage{

    private static UserStorage instance;
    private static final String INSERT_USER = "insert into userTab(name, username) values (?,?)";


    private UserStorage() {
    }

    public static UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }


    public void save(User user) {
        Connection connection = ConnectJDBC.getPostgresConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
