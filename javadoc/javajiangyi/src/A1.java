/**
 * @author shkstart
 * @create 2022-07-21 22:20
 */

class	A1 {
    int	x=4;
    int	y=1;
    public	void printme()
    {
        System.out.println("x="+x+"	y="+y);
    }
}
class B1 extends A1{
    int	x;
    public	void	printme()
    {
        int	z=super.x+6;
        super.printme();
        x=5;
        System.out.println("z="+z+"x="+x);
    }
    public	static	void main(String arg[])
    {
        A1 a = new A1();
        B1 b = new	B1();
        a.printme();
        b.printme();
    }
}
