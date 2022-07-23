package theme6loop;

/**
 * @author shkstart
 * @create 2022-07-23 7:46
 */

public class LoopForever {
    public static void main(String[] args) {
        int i=4;
        for(;i<100;i++){
            System.out.println(i);
        }
        for(int j=20 ;j<100;){
            j++;
            System.out.println(j);
        }
        for( ; ; ){
            System.out.println("该循环将永远执行");
        }
    }
}
