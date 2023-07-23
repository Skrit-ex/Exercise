package TeachMeSkills.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JDBCOperationStorage {

    private final Connection connection;

    private final static String INSERT_INTO = "insert into operation ( num1, num2, type, result) values ( ?, ?, ?,?)";
    private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USER_JDBC = "postgres";
    private final static String PASSWORD_JDBC = "admin";
    private final static String DELETE_SQL = "delete from operation where id = ?";

    public JDBCOperationStorage() {
        try {
            this.connection = DriverManager.getConnection (URL, USER_JDBC , PASSWORD_JDBC );
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

    public void save(Operation operation) {
        PreparedStatement preparedStatement;
        try {
         preparedStatement = connection.prepareStatement(INSERT_INTO);
         // preparedStatement.setInt(1,operation.getId());
        preparedStatement.setInt(1, operation.getNum1());
        preparedStatement.setInt(2, operation.getNum2());
        preparedStatement.setString(3, operation.getType());
        preparedStatement.setInt(4, operation.getResult());
        preparedStatement.execute();
    }catch (SQLException e){
            throw new RuntimeException();
        }

    }
    public List<Operation> findAll(){
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select  * from operation ");
            List<Operation> operationList = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                int num1 = resultSet.getInt(2);
                int num2 = resultSet.getInt(3);
                String type = resultSet.getString(4);
                int result = resultSet.getInt(5);
                Operation operation = new Operation(id, num1, num2, type, result);
                operationList.add(operation);
            }
            return operationList;
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }
    public void deleteById( int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public Optional<Operation> findById(int id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from operation where id=?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int OPid = resultSet.getInt(1);
                int num1 = resultSet.getInt(2);
                int num2 = resultSet.getInt(3);
                String type = resultSet.getString(4);
                int result = resultSet.getInt(5);
                Operation operation1 = new Operation(OPid, num1, num2, type, result);
                return Optional.of(operation1);
            }
            return Optional.empty();
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

}
