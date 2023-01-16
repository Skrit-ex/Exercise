package Calculator;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Ваш результат равен : " + result);
        System.out.println("Желаете выполнить ещё одну калькуляцию ");
    }

    public static int getInt() {
        int num;
        System.out.println("Введите число ");
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе, попробуйте ещё раз ");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation() {
        char operation;
        System.out.println(" выберите операцию : +, -, *, / ");
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println(" Вы ввели неверную операцию, попробуйте ещё раз ");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println(" Операции не распознаны , попробуйте ещё раз ");
                result = calc(num1,num2, getOperation());
        }
        return result;
    }

}
