package TeachMeSkills.Stream;

import Calculator.CalculatorTMS.entity.Operation;

import java.util.Comparator;

public class OperationNum2Comparator implements Comparator <Operation> {

    @Override
    public int compare(Operation o1, Operation o2) {
        if(o1.getNum2() > o2.getNum2()){
            return 1;
        }else if (o1.getNum2() < o2.getNum2()){
            return -1;
        }
        return 0;
    }
}
