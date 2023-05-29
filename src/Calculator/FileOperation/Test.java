package Calculator.FileOperation;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        Operation operation = new Operation(25,25,50,"sum");
        Operation operation1 = new Operation(12,25,37,"sum");
        Operation operation2 = new Operation(1,25,26,"sum");
        Operation operation3 = new Operation(21,21,42,"sum");

        FileOperationStorage fileOperationStorage = new FileOperationStorage();
//        fileOperationStorage.save(operation);
//        fileOperationStorage.save(operation1);
//        fileOperationStorage.save(operation2);
//        fileOperationStorage.save(operation3);

        fileOperationStorage.findAll();

    }
}
