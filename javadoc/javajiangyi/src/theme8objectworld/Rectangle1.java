package theme8objectword;

/**
 * @author shkstart
 * @create 2022-07-24 10:29
 */

public class Rectangle1 {
    private float length;//长度
    private int width;//宽度
    private String color;//颜色
    Rectangle1 () {
        length = 3.5f;
        width = 4;
        color= "红色";
    }
    Rectangle1 (float l, int w, String c) {
//定义有 3 个参数的构造方法
        length = l;
        width = w;
        color = c;
    }
    public float computeArea(){
//计算面积s
        return length* width;
    }
    public void showColor(){
        System.out.println("该长方形的颜色是"+color);
    }
    static class demo {
        public static void main(String[] args) {
            Rectangle1 rectangle1=new Rectangle1 ();
            System.out.println("长方形1面积是"+rectangle1.computeArea());
            rectangle1.showColor();
            Rectangle1 rectangle2=new Rectangle1 (4.5f, 6, "绿色");
            System.out.println("长方形2面积是"+rectangle2.computeArea());
            rectangle2.showColor();
        }
    }
}
