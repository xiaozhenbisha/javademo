package theme7array;

/**
 * @author shkstart
 * @create 2022-07-23 22:28
 */

public class LetterCount {
    public static void main(String[] args) {
        //1 将短语存储到字符串数 组 phrase 中
        String phrase[] = {
                "A STITCH IN TIME SAVES NINE",
                "DON'T EAT YELLOW SNOW",
                "JUST D0 IT",
                "EVERY GOOD BOY DOES FINE",
                "I WANT MY MTV",
                "HOW,BOUT THEM COWBOYS",
                "PLAY IT AGAIN,SAM",
                "WILL IT PLAY IN PEORIA"};
        //2 创建数组存储每个字母 的使用次数
        int[] letterCount = new int[26];

        //System.out.println(letterCount);
        //3遍历字符串数组，将当前 字符串转换为字符数组。
        for (int count = 0; count < phrase.length; count++) {
            String current = phrase[count];
            char[] letters = current.toCharArray();
            //4 遍历当前短语中的所有 字符，判断是字符是否是字 母，如果是就将字母相对应 的变量加一
            for (int count2 = 0; count2 < letters.length; count2++) {
                char lett = letters[count2];
                //System.out.println(lett);
                if ((lett >= 'A') & (lett <= 'Z'))
                   ++letterCount[lett - 'A'];
            }

        }
        //5 打印统计的结果。
        for (char count3 = 'A'; count3 <= 'Z'; count3++)
            System.out.print(count3 + ": "+ letterCount[count3 - 'A'] + "\t");
        System.out.println();

    }
}
