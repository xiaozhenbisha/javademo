package theme9objectdeep;

/**
 * @author shkstart
 * @create 2022-07-24 10:22
 */
//为 Shape 类写一个带有参数的构造函数
public class Shape1 {

    private String name;//名字
   public Shape1(String n){
        this.name = n;
    }
    public void printName(){
     //打印名字
        System.out.println("name" + name);
    }

    public static void main(String[] args) {
        Shape1 sh =new Shape1("长方形");
        System.out.println(sh.name);
    }
}
