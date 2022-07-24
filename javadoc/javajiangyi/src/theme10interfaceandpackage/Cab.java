package theme10interfaceandpackage;

/**
 * @author wzn
 * @create 2022-07-24 15:08
 */

public interface Cab extends Car {
    //修饰符 接口名 父接口列表
//接口体
    public final static double RATE=3.245;
    abstract double getPrice();
    abstract double getDate();
}
