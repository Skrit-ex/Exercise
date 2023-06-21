package ExersiceDemo.Equals;

public class EqualsDemi {
    public static void main(String[] args) {
        String string1 = "hero";
        String string2 = "demo";

        Test test = new Test(1);
        Test test2 = new Test(2);

        System.out.println(test == test2);
    }
}

class Test {
    private int id;

    public Test(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Test testdown = (Test) obj;
        return this.id == testdown.id;
    }

}
