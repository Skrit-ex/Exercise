package by.tms.until;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
        public static Connection getPostgresConnection(){  //фабричный статический метод(паттерн)
            Connection connection;
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
            }
            catch (SQLException e){
                throw new RuntimeException(e);
            }
            return connection;
        }
    }
