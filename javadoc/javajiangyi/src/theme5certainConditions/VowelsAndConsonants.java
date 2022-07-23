package theme5certainConditions;

/**
 * @author shkstart
 * @create 2022-07-23 7:36
 */

public class VowelsAndConsonants {
    public static void main(String[] args) {
        //随机产生一个字母
        char c = (char)(Math.random() * 26 + 'a');
        System.out.print(c + ": ");
        //根据字母判断是否是元音
        switch(c) {
            //当字母是 a,e,i,o,u 的时候一定是元音
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音");
                break;
            //当字母是 y,w 时，可能是元音
            case 'y':
            case 'w':
                System.out.println("有时是元音");
                break;
            //其它字母都是辅音
            default:
                System.out.println("辅音");
        }
    }
}
