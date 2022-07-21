/**
 * @author shkstart
 * @create 2022-07-21 22:24
 */

public class Employee {
    String name;
    public Employee(String n) {
        name = n;
    }
}
class Manager extends Employee {
    String department;
    public Manager(String s, String d) {
        super(s);
        department = d;
    }
}
