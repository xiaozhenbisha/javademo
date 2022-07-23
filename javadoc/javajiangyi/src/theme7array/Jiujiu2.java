package theme7array;

/**
 * @author shkstart
 * @create 2022-07-23 22:25
 */

public class Jiujiu2 {
    public static void main(String[] args) {
        int i,j;
        int[][] result = new int[9][9];
        for(i=1;i<=9;i++){
            for(j=1;j<=9;j++){
                result[i-1][j-1]=i*j;
                System.out.println("result["+i+"]"+"["+j+"] = "+i*j);
            }
        }
    }
}
