package TeachMeSkills.JDBCadvanced;

import java.sql.*;

public class Test {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");

//        Statement statement = connection.createStatement();
//
//        //createStatement  - создаёт и выполняет запрос
//        boolean execute = statement.execute("");  // если данные не нужно менять
//        int i = statement.executeUpdate("");  //если данные при вызове или в процесе обновятся(+количество обновлений)
//        ResultSet resultSet = statement.executeQuery(""); // если данные берутся готовые (из таблицы) бызы данных
//
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from account where id = ? and username = ?");
//        preparedStatement.setInt(1, 12);  //id
//        preparedStatement.setString(2,"ste"); //username
//
//        boolean execute1 = preparedStatement.execute();
//        int i1 = preparedStatement.executeUpdate();
//        ResultSet resultSet1 = preparedStatement.executeQuery();
//
//

//        // 1 вариант занесения в базу
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into account values (default, 'Test', 'test', 'test');");  //написание запроса
//        preparedStatement.execute();


        //2 вариант занесения в таблицу
        PreparedStatement preparedStatement = connection.prepareStatement("insert into account values (default, ?,?,?)");
        preparedStatement.setString(1, "test2");
        preparedStatement.setString(2, "test2");
        preparedStatement.setString(3, "test2");
        preparedStatement.execute();


        //работа с результатом

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String username = resultSet.getString(3);
            String password = resultSet.getString(4);

            System.out.printf("%s,%s,%s,%s", id, name, username, password);
        }
    }
}
