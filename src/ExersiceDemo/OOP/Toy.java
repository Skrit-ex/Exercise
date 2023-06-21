package ExersiceDemo.OOP;

public class Toy {
    String name;
    int cost;
    String manufacture;
    int age;

    public Toy(String name, int cost, String manufacture, int age) {
        this(name,cost, manufacture);
        this.age = age;
        System.out.println("В конструкторе с четырмя параметрами");
    }

    public Toy(String name, int cost, String manufacture) {
        this();
        this.name = name;
        this.cost = cost;
        this.manufacture = manufacture;
        System.out.println("В конструкторе с тремя параметрами");
    }

    public Toy() {
        System.out.println(" В конструкторе по умолчанию");
    }
}

