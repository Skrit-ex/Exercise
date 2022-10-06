package HomeWork.Generics;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public class Query {
        public void printToLog() {
            Query query = new Query();
            System.out.printf("Пользователь с логином %s и поролем %s отправил запрос", login,password);
        }
    }


        public static void main(String[] args) {
            // создать экземпляр класса User и вызвать метод createQuery()
            User user = new User("Skraw", "dawdfa");
            user.createQuery();
            System.out.println();
            //создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query()
            User.Query query = user.new Query();
            query.printToLog();
            System.out.println();
            User.Query query1 = new User("Idawd", "dawdaw").new Query();
            query1.printToLog();
            //создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
        }
    }

