/**
 * @author shkstart
 * @create 2022-07-21 22:11
 */

public class A {
    int x=10;
    int	 y=20;
    int area(int x,int y)
    {
        System.out.println("x="+x+ "y=" +y);
        System.out.println("this.x=" +this.x+ "this.y=" + this.y);
        this.x=x;
        this.y=y;
        int s=this.x*this.y;
        return	s;
    }
     int countArea(){
        return	this.x*this.y;
    }
    int perimeter(){
        return	this.countArea();
    }
}
class B extends A{
    public static void main(String[] args)
    {
        int a=6,b=8,z1,z2;
        B b1 = new B();
        z1=b1.perimeter();
        System.out.println("z1="+z1);
        z2=b1.area(a,b);
        System.out.println("z2="+z2);
    }
}
