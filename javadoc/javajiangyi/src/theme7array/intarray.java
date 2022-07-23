package theme7array;

/**
 * @author shkstart
 * @create 2022-07-23 22:22
 */

public class intarray {
    public static void main(String[] arguments){
        String mostFamous = "Rudolph the Red-Nosed Reindeer";
        char[] mfl = mostFamous.toCharArray();
        for(int dex = 0; dex<mfl.length;dex++){
            char current= mfl[dex];
             //不是空格就打印原来的字符
          if(current!=' '){
            System.out.print(current);
              System.out.println();
          }else{
            //是空格就打印圆点
              System.out.print('.');
          }
        }
    }
}
