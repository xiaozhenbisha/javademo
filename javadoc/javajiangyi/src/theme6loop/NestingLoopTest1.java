package theme6loop;

/**
 * @author shkstart
 * @create 2022-07-23 17:13
 */
//在这个例子中，如果变量 points 大于 50，break 语句将导致退出 for 循环。 然而 while 循环永远不会结束。因为变量 target 永远不会大于 100
public class NestingLoopTest1 {
    public static void main(String[] args) {
        int points=0;
        int target=100;
        while(target<=100){
            for(int i=0;i<target;i++){
                if(points > 50)
                    break;
                points=points+i;
                System.out.println(points);
            }
        }
    }
}
