package theme8objectword;

/**
 * @author shkstart
 * @create 2022-07-23 23:10
 */

public class Rectangle extends shape implements rectangleDao {
    private float length;//长度
    private float width;//宽度

    public float computeArea() {
      //计算面积
        return length*width;
    }
    public void printParameter(){
        System.out.println(length);
        System.out.println(width);
//打印参数
    }
}
