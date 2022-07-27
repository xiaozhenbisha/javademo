package com.java.enumandannotation;

public class Season2 {
    //2. 类的内部创建对象
    //SPRING("春天", "春眠不觉晓"),
   // SUMMER("夏天", "夏天蚊子咬"),
   // AUTUMN("秋天", "秋天叶子黄"),
   // WINTER("冬天", "冬天雪花飘");

    private String seasonName;
    private String seasonDesc;


    //1. 私有化构造器
    private Season2(String seasonName, String seasonDesc){
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
