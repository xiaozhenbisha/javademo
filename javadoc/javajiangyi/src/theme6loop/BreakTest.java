package theme6loop;

/**
 * @author shkstart
 * @create 2022-07-23 19:41
 */

public class BreakTest {
    public static void main(String[] args) {
        int index=0; while(index<=1000){
            index=index+5; if(index==400)
                break;
            System.out.println("The index is "+index);
        }
    }
}
