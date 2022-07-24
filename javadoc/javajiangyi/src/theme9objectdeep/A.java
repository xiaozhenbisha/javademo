package theme9objectdeep;

/**
 * @author shkstart
 * @create 2022-07-24 12:15
 */

/**
 * **this** **的用法**
 *
 * 在一些容易混淆的场合，例如，成员方法的形参名与数据成员名相同，或者成员方法的局部变量名与数据成员名相同时，在方法内借助 this 来明确表示引用的是类的数据成员，而不是形参或局部变量，从而提高程序的可读性。简单地说，this 代表了当前对象的一个引用，可将其理解为对象的另一个名字，通过这个名字可以顺利地访问对象、修改对象的数据成员、调用对象的方法。归纳起来，this 的使用场合包括：
 *
 * （1）用来访问当前对象的数据成员，其使用形式如下：
 *
 * ​		 this.数据成员
 *
 * （2）用来访问当前对象的成员方法，其使用形式如下：
 *
 * ​			this.成员方法（参数）
 */
class A {
    int x = 10;
    int y = 20;
    int area(int x, int y) {
        System.out.println("x=" + x + "y=" + y);
        System.out.println("this.x=" + this.x + "this.y=" + this.y);
        this.x = x;
        this.y = y;
        int s = this.x * this.y;
        return s;

    }
    int countArea() {
        return this.x * this.y;

    }

    public static void main(String[] args) {
        A a1 = new A();
        a1.area(1,2);
        System.out.println( a1.area(1,2));
        System.out.println(a1.countArea());
    }
}
