package Calculator.CalculatorTMS.storage;

import Calculator.CalculatorTMS.entity.Operation;
import Calculator.CalculatorTMS.entity.OperationType;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCOperationStorage implements OperationStorage{

    private static final String SELECT_ALL_OPERATION = "select  * from operation ";
    private static final String POSTGRES = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";
    private static final String INSERT_OPERATION = "insert into operation ( num1, num2, type, result) values ( ?, ?, ?,?)";

    private final Connection connection;


    public JDBCOperationStorage() {
        try{
            connection = DriverManager.getConnection(POSTGRES, USER,PASSWORD);
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }


    @Override
    public void save(Operation operation) throws IOException {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT_OPERATION);
            preparedStatement.setDouble(1, operation.getNum1());
            preparedStatement.setDouble(2, operation.getNum2());
            preparedStatement.setString(3, String.valueOf(operation.getType()));
            preparedStatement.setDouble(4, operation.getResult());
            preparedStatement.execute();
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }

    @Override
    public List<Operation> findAll() throws IOException {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_OPERATION);
            List<Operation> operationList = new ArrayList<>();

            while (resultSet.next()){
                double id = resultSet.getDouble(1);
                double num1 = resultSet.getDouble(2);
                double num2 = resultSet.getDouble(3);
                String type = resultSet.getString(4);
                double result = resultSet.getDouble(5);
                Operation operationJDBC = new Operation(id,num1,num2, type,result);
                operationList.add(operationJDBC);
            }
            return operationList;
        }catch (SQLException e){
            throw  new RuntimeException();
        }
    }
}
