package TeachMeSkills.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostgreSQL {
    public static void main(String[] args) throws SQLException {
        // 1 connection   - подключение к базе данных
    Connection connection =
        DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");

    //  2 statement   - выполнить запрос
//
//        Statement statement = connection.createStatement();
//        statement.execute("insert into operation ( num1, num2, type, result) values ( 25, 25, 'sum', 50)");

        // 3 prepareStatement  - выполнить запрос, подготовив данные
//        PreparedStatement preparedStatement =
//           connection.prepareStatement("insert into operation ( num1, num2, type, result) values ( ?, ?, ?, ?)");
//            preparedStatement.setInt(1,23);
//            preparedStatement.setInt(2,23);
//            preparedStatement.setString(3,"sum");
//            preparedStatement.setInt(4,46);
//            preparedStatement.execute();

        // 4 resultSet
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select  * from operation ");
        List<Operation> operationList = new ArrayList<>();

        while (resultSet.next()){
            int id = resultSet.getInt(1);
            int num1 = resultSet.getInt(2);
            int num2 = resultSet.getInt(3);
            String type = resultSet.getString(4);
            int result = resultSet.getInt(5);

            Operation operation = new Operation(id, num1, num2, type, result);
            operationList.add(operation);

            //удаление
            PreparedStatement preparedStatement =
                    connection.prepareStatement("delete from  operation where type =?");//подготовка запроса
            preparedStatement.setInt(1, 3); //удаление где id-3
            preparedStatement.execute();
        }
        System.out.println(operationList);
    }
}
