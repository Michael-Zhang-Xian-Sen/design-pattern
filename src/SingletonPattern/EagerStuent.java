package SingletonPattern;

public class EagerStuent {
    private static EagerStuent eagerStuent = new EagerStuent();
    private String name;
    private int age;

    private EagerStuent(){};

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(){
        System.out.println("我的名字是："+name+"，我今年"+age+"岁了。");
    }

    public static EagerStuent getInstance(){
        return eagerStuent;
    }
}
