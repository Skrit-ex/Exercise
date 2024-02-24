package by.tms.storage;

import by.tms.User;
import by.tms.until.ConnectJDBC;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OperationStorage implements Storage {

    private static OperationStorage instance;
    private static final String INSERT_USER = "insert into users(user, userName, password) values (?,?,?)";
    private static final String SELECT_ALL_USER = "select * from users";
    private OperationStorage() {
    }

    public static OperationStorage getInstance() {
        if (instance == null) {
            instance = new OperationStorage();
        }
        return instance;
    }


    @Override
    public void save(User user) {
        Connection postgresConnect = ConnectJDBC.getPostgresConnection();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public boolean checkUsername(String username) {
        return false;
    }
}
