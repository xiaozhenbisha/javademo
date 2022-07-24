package theme8objectworld;

/**
 * @author shkstart
 * @create 2022-07-24 11:05
 */

public class Balloon {
    public float radial;//半径
    public String color;//颜色
    public void fly(){
        System.out.println("气球飞");
    }

    public static void main(String[] args) {
        Balloon balloon1 =new Balloon ();
        Balloon balloon2 = balloon1;
        balloon1.fly();
        balloon2.fly();
    }
}
