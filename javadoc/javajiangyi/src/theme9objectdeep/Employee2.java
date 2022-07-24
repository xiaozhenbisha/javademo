package theme9objectdeep;

/**
 * @author wzn
 * @create 2022-07-24 14:00
 */

/**
 * 调用父类的构造函数
 * 通常要定义一个带参数的构造函数，并要使用这些参数来控制一个对象的父类部分的构造。
 * 可能通过从子类构造函数的第一行调用关键字 super 的手段调用一个特殊的父类构造函数作为子类初始化的一部分。
 * 要控制具体的构造函数的调用，必须给 super()提供合适的参数。
 * 当不调用带参数的 super 时，缺省的父类构造函数（即，带 0 个参数的构造函数）被隐含地调用。在这种情况下，
 * 如果没有缺省的父类构造函数，将导致编译错误。
 */
public class Employee2 {
    String name;
    public Employee2(String n) {
        name = n;
    }
}

class Manager2 extends Employee2 {
    String department;
    public Manager2(String s, String d) {
        super(s);
        department = d;
    }
}
