package theme4modifydata;

public class Mix {
    public static void main(String[] args){
        int x = 0;
        int y = 30;
        //x = x+3;
        //x++;
        //y--;
        y=	y*5+x;
        y-= 2;
        x = y + --x;
       //打印x和y的值
        //System.out.print(x + "" + y);
        boolean isOver = true;
        int life = 5;
        isOver = life == 0;
        System.out.println(life);
        System.out.println(isOver);
        int a = 9;
        boolean b1 = a < 10;
        int max =  90;
        boolean b2 = max > 53;
        System.out.println(b1);
        System.out.println(b2);
    }
}
