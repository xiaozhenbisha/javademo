package theme8objectworld;
/**
 * @author shkstart
 * @create 2022-07-24 10:03
 */
public class Square {
    static boolean isUser;
    private float length;//边长
    //修饰符      方法名
    public static float computeArea(float length){
        //计算面积
        //返回值类型 形参列表
        return length* length;
    }
    public static void main(String[] args) {
        Square .isUser = true;
       // Square s = new Square();
        //s.length =10;
       // float m = s.computeArea(5);
        System.out.println(Square.computeArea(5));
    }
}
