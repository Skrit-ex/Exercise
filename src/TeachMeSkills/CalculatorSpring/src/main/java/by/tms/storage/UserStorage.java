package by.tms.storage;

import by.tms.User;
import by.tms.until.ConnectJDBC;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@ComponentScan (basePackages = "tms.until")
public class UserStorage implements Storage {

    private static UserStorage instance;
    private static final String INSERT_USER = "insert into users1(firstname, username, email, password) values (?,?,?,?)";
    private static final String SELECT_ALL_USER = "select * from users1";

    private UserStorage() {
    }

    public static UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }


    @Override
    public void save(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);
                preparedStatement.setString(1, user.getFirstname());
                preparedStatement.setString(2, user.getUsername());
                preparedStatement.setString(3, user.getEmail());
                preparedStatement.setString(4, user.getPassword());
                preparedStatement.execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

        @Override
    public Optional<User> findByEmail(String email) {
            Connection connection = ConnectJDBC.getPostgresConnection();
            try{
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(SELECT_ALL_USER);
                List<User> userList = new ArrayList<>();
                while (resultSet.next()){
                    if(resultSet.getString("email").equals(email)){
                        int id = resultSet.getInt("id");
                        String firstname = resultSet.getString("firstname");
                        String username = resultSet.getString("username");
                        String password = resultSet.getString("password");

                        User user = new User(id, firstname, username, email, password);
                        userList.add(user);
                        return Optional.of(user);
                    }
                }

            }
            catch (SQLException e){
                throw new RuntimeException(e);
            }
        return Optional.empty();
    }

    @Override
    public boolean checkUsername(String username) {
        return false;
    }
}
