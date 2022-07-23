package theme6loop;

/**
 * @author shkstart
 * @create 2022-07-23 19:38
 */

public class NestingLoopTest2 {
    public static void main(String[] args) {
        int points=0;
        int target=100;
        targetloop:
        while(target<=100){
            for(int i=0;i<target;i++){
                if(points > 50)
                    break targetloop;
                points=points+i;
                System.out.println(points);
            }
        }
    }
}
