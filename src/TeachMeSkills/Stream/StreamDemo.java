package TeachMeSkills.Stream;


import TeachMeSkills.Enum.Oper;
import TeachMeSkills.LambdaExersice.Calculator.Operation;
import TeachMeSkills.LambdaExersice.Calculator.OperationType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        // 1 пример
//        List<Integer> integers = new ArrayList<>();
//
//        integers.add(2);
//        integers.add(4);
//        integers.add(5);
//        integers.add(7);
//        integers.add(1);
//        integers.add(3);

//        Stream<Integer> stream = integers.stream();
//        List<Integer> collect = stream.filter(integer -> integer > 2).collect(Collectors.toList());
//        System.out.println(collect);
//        //запись в одну строку
//        integers.stream().filter(integer -> integer > 2).forEach(System.out::println);

//        Stream<Integer> stream = integers.stream();
//        List<Integer> collect = stream.filter(integer -> integer > 2).sorted().collect(Collectors.toList());
//        System.out.println(collect);


        // 2 пример

        List<Operation> operations = new ArrayList<>();
        operations.add(new Operation(12,51, OperationType.SUM));
        operations.add(new Operation(151,24, OperationType.SUM));
        operations.add(new Operation(52,63, OperationType.SUM));
        operations.add(new Operation(62,61, OperationType.SUM));



        Stream<Operation> stream = operations.stream();
        OperationNum2Comparator comparator = new OperationNum2Comparator();

        List<Operation> collect = stream.filter(operation -> operation.getNum1() > 25).sorted((o1, o2) -> {
            //или вставить компоратор OperationNu2Comporator (?проблемы с запуском)
                    if(o1.getNum2() > o2.getNum2()){
                        return 1;
                    }else if (o1.getNum2() < o2.getNum2()){
                        return -1;
                    }
                    return 0;
                }).collect(Collectors.toList());

        System.out.println(collect);

            }
        }