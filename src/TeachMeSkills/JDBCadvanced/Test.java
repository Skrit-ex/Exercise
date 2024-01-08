package TeachMeSkills.JDBCadvanced;

import java.sql.*;

public class Test {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");

        Statement statement = connection.createStatement();

        //createStatement  - создаёт и выполняет запрос
        boolean execute = statement.execute("");  // если данные не нужно менять
        int i = statement.executeUpdate("");  //если данные при вызове или в процесе обновятся(+количество обновлений)
        ResultSet resultSet = statement.executeQuery(""); // если данные берутся готовые (из таблицы) бызы данных

        PreparedStatement preparedStatement = connection.prepareStatement("select * from users where id = ? and username = ?");
        preparedStatement.setInt(1, 12);  //id
        preparedStatement.setString(2,"ste"); //username

        boolean execute1 = preparedStatement.execute();
        int i1 = preparedStatement.executeUpdate();
        ResultSet resultSet1 = preparedStatement.executeQuery();

    }
}
