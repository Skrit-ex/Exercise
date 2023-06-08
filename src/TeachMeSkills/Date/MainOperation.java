package TeachMeSkills.Date;

import java.time.LocalTime;

    public class MainOperation{

        public Operation calculator(Operation operation){

        switch (operation.getType()){
            case "sum": operation.setResult(operation.getNum1()+ operation.getNum2());
            operation.setCreateAt(LocalTime.now());
            return operation;
        }
        return operation;
    }
}
