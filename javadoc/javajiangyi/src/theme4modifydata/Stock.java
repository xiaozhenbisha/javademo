package theme4modifydata;

public class Stock {
    public static void main(String[] args){
        float money = 20000f;
        System.out.println("初始金额："+money);//净增 500 元
        money = money + 500;
        System.out.println("1 个月后："+money);//亏损 700 元
        money = money - 700;
        System.out.println("2 个月后："+money);//增值 15%
        money = money + money * 0.15f ;
        System.out.println("3 个月后："+money);//剩余一半资金
        money = money / 2;

        System.out.println("期末价值："+money);
        money = money + ( money * 3 );
        System.out.println("期末价值："+money);
        //求余数的运算在计算机专业术语中叫**求模**。要获得除法运算的余数
        int weight_lost = 138 % 25;
        System.out.println(weight_lost);
        int a = 10;
        int b = 11;
        int c = a -(++b);
        System.out.println(c);
        /**
         * 下面的程序片段中分别使用了前递增和后递增,gumballs 的初始值均为28，程序运行结束后 gumballs 的值均为 29。
         * 但是，我们查看打印结果，一条语句打印 29，另一条语句打印 28，是什么原因呢？我们看看两者的差异
         */
        int gumballs = 28;
        System.out.println(gumballs++);
        System.out.println(++gumballs);


        //
    }
}
