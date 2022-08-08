package HomeWork.String.Homework6;

public class Employee {
    private String fullname;
    private String salary;

    public Employee(String fullname, String salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
    public String getFullname(){
        return fullname;
    }
    public void setFullname(String fullname){
        this.fullname = fullname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
