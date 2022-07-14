package com.atguigu.java;

/*
自定义枚举类
 */
public class Season1 {

    private String seasonName;
    private String seasonDesc;

    //2. 类的内部创建对象
    public static final Season1 SPRING = new Season1("春天", "春眠不觉晓");
    public static final Season1 SUMMER = new Season1("夏天", "夏天蚊子咬");
    public static final Season1 AUTUMN = new Season1("秋天", "秋天叶子黄");
    public static final Season1 WINTER = new Season1("冬天", "冬天雪花飘");

    //1. 私有化构造器
    private Season1(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
