package theme8objectword;

/**
 * @author shkstart
 * @create 2022-07-24 10:18
 */

/**
 *在 Java 中，任何变量在被使用前都必须先设置初值。
 * Java 提供了为类的成员 变量赋初值的专门功能:构造函数(constructor)。
 * 构造函数是一种特殊的成员方法，它的特殊性反映在如下几个方面:
 *  ·构造函数名与类名相同。
 *
 * · 构造函数不返回任何值，也没有返回类型。
 * · 每一个类可以有零个或多个构造函数，但是参数必须不同  构造函数在创建对象时自动执行，一般不能直接调用。
 *
 */

public class Box {
    double width;
    double height;
    double depth;
    // Box 的构造函数
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    public double volume(double width,double height,double depth){
        return width* height*depth;
    }
}
class ComputeVol{
    public static void main(String args[]) {
        Box mybox1 = new Box();
        double vol;
        vol = mybox1.volume(10,10,10);
        System.out.println("Volume is " + vol); }
}