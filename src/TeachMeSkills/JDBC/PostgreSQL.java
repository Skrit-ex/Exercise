package TeachMeSkills.JDBC;

import java.sql.*;

public class PostgreSQL {
    public static void main(String[] args) throws SQLException {
        // 1 connection
    Connection connection =
        DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");

    //  2 statement
//
//        Statement statement = connection.createStatement();
//        statement.execute("insert into operation ( num1, num2, type, result) values ( 25, 25, 'sum', 50)");

        // 3 prepareStatement
        PreparedStatement preparedStatement =
           connection.prepareStatement("insert into operation ( num1, num2, type, result) values ( ?, ?, ?, ?)");
            preparedStatement.setInt(1,23);
            preparedStatement.setInt(2,23);
            preparedStatement.setString(3,"sum");
            preparedStatement.setInt(4,46);
            preparedStatement.execute();

        // 4 resultSet
        Statement statement = connection.createStatement();
        statement.executeQuery("select  * from operation where type='sum'");
    }
}
