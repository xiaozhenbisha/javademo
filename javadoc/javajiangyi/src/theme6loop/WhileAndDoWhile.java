package theme6loop;

/**
 * @author shkstart
 * @create 2022-07-23 17:09
 */

public class WhileAndDoWhile {
    public static void main(String[] args) {
        int limit=5;
        int count=1;
        while(count < limit){
            System.out.println("*********");
            count++;
        }
        System.out.println();
        int limit1=5;
        int count1=1;
        do{
            System.out.println("*********");
            count1++;
        }while(count1<limit1);
    }

}
