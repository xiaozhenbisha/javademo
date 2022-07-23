package theme7array;

/**
 * @author shkstart
 * @create 2022-07-23 22:00
 */

public class VarArray {
    /**
     * 我们可以创建存放任何类型信息的数组。例如，下面的语句声明了一个整型数组，一个布尔型数组和一个字符串数组:
     */
    int[] reindeerWeights;
    boolean[] hostileAirTravelNatlons;
    String[] studentNames;
    /**
     * 下面的语句创建了一个名为 elfSeniority 的整型数组，该数组最多存储 250 个元素。
     */
    int[] elfSeniority = new int[250];

    /**
     * 下面的例子创建一个字符串数组并存储了 5 个人的姓 名:
     */
    String[] names = {"丁一","王二","张三","李四","赵五"};

    public static void main(String[] args) {
        String[] names1;
        names1 = new String[5];
        names1[0] = "丁一";
        names1[1] = "王二";
        names1[2] = "张三";
        names1[3] = "李四";
        names1[4] = "赵五";
        System.out.println(names1[0]);
        /**
         * 和变量一样，你也可以将一个数组指派给另一个数组。
         */
        int[] a = {1,2,3,4};
        int[] b = a;
        System.out.println(b[0]);
        String[] weekday = { "周一","周二","周三","周四","周五","周六", "周日"};
        System.out.println("数组中共有"+weekday.length+"个元素");
    }
/**
 * 注意:数组一旦创建，就不能增大其空间，增加其他的元素。
 * 即使又 需要添加一个名字，也不能将其作为第 6 个元素加入到数组 names 中，
 * Java 编译器不允许我们这样做，因为有潜在的危险。
 */




}
