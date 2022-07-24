package theme9objectdeep;

/**
 * @author shkstart
 * @create 2022-07-24 11:15
 */

public class Account {
    // 父类 Account 中有三个变量:year、 name 和 roleCode。
    private int year;//年龄
    protected String name;//姓名
    protected String roleCode;//角色代码
    //帐户类
    /**
     *  public void final end(){
     *         System.out.println("Account中的end方法是final的方法，不能继承");
     *     }
     */

    public boolean println (){
        System.out.println("Account 中的 println 方法");
        return true;

    }
    public String toString (){
        return "Account 中的 toString 方法";
    }
};
class Manager extends Account {//管理者类
    //子类Manager继承了Account中的name，隐藏了Account中的roleCode，添加了自己的成员变量 level。
    // 由于 Account 中 year 变量是私有的，
    // 因此子类 Manager 并没有继承。
    protected String roleCode;// 管理者角色代码
    protected String level;// 管理者级别
    public boolean println (String s){
        System.out.println("Manager 中的 println 方法"+s);
        return true;
    }
    public String toString (){
        return "Manager 中的 toString 方法";
    }
    public String show (){
        System.out.println("Manager 中的 show 方法");
        return "success";
    }
};
class HRManager extends Manager {//人力资源管理者类
    //子类 HRManager 继承了 Account 中的 name 和 Manager 中的 roleCode，
    // 隐藏了 Manager 中的 level，添加了自己的成员变量 level。
    protected String level;// 人力资源管理者级别
    protected String workSpace;//工作地点
    public boolean println (){
        System.out.println("HRManager 中的 println 方法");
        return true;
    }
    public String show (){
        System.out.println("HRManager 中的 show 方法");
        return "success";
    }
};
