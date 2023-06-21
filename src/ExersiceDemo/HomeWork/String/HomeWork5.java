package ExersiceDemo.HomeWork.String;

/*
Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
Форматирование и вывод строки на консоль написать в отдельном методе, который принимает фамилию,
оценку и название предмета в качестве параметров. Выделить под фамилию 15 символов, под оценку 3 символа, под предмет – 10.
Пример вывода:

Студент Иванов            получил 5   по Математике

Студент Петрова         получил 4   по Физике

Студент Сидорова        получил 3   по Программированию
*/


import java.util.Formatter;

public class HomeWork5 {
    public static void main(String[] args) {
        System.out.println(modif1("Valera", "5", "Математике"));
        System.out.println(modif1("Ivan", "4", "Physic"));
        System.out.println(modif1("Сидорова", "3", "Программированию"));

        System.out.println();

    }
    //stringBuilder append
    /*public static StringBuilder modif(String name, String grade, String predmet) {
        StringBuilder result = new StringBuilder();
        result.append("Студент ").append(name).append(" получил ").append(grade).append(" по ").append(predmet).append("\n");
*/

    //форматирование
    public static Formatter modif1(String name, String grade, String predmet) {
        Formatter result = new Formatter();
        result.format("Cтудент %-15s получил %-3s по %-10s", name, grade, predmet);
        return result;
    }
}
