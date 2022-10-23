package Lambda.Supplier;


/*Интерфейс Supplier используется тогда, когда на вход не передаются значения, но необходимо вернуть результат.
 */


import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random()*10);
        System.out.println(supplier.get());
    }
}
