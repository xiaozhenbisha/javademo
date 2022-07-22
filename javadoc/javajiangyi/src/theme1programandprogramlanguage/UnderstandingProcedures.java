package theme1programandprogramlanguage;

import java.util.Scanner;

public class UnderstandingProcedures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isGameOver = scan.nextBoolean();
        if(isGameOver	==	true){
            System.out.println("游戏结束！");
        }else{
            System.out.println("请重新再玩一次 ");
        }
    }
}
