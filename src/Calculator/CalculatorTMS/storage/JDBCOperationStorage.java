package Calculator.CalculatorTMS.storage;

import Calculator.CalculatorTMS.entity.Operation;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCOperationStorage implements OperationStorage{
    private final Connection connection;


    public JDBCOperationStorage() {
        try{
            connection = DriverManager.getConnection
                    ("jdbc:postgresql://localhost:5432/postgres", "postgres", "admin");
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }


    @Override
    public void save(Operation operation) throws IOException {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement
                    ("insert into operation ( num1, num2, type, result) values ( ?, ?, ?,?)");
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
            ResultSet resultSet = statement.executeQuery("select  * from operation ");
            List<Operation> operationList = new ArrayList<>();

            while (resultSet.next()){
                double num1 = resultSet.getDouble(1);
                double num2 = resultSet.getDouble(2);
                String type = resultSet.getString(3);
                double result = resultSet.getDouble(4);
                Operation operationJDBC = new Operation(num1,num2,type,result);
                operationList.add(operationJDBC);
            }
            return operationList;
        }catch (SQLException e){
            throw  new RuntimeException();
        }
    }
}
