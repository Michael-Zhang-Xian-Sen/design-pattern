package SingletonPattern;

/**
 * 饿汉式单例
 */
public class LazyStudent {
    private static LazyStudent lazyStudent;
    private String name;
    private int age;

    private LazyStudent(){ }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void showInfo(){
        System.out.println("我的名字是："+name+"，我今年"+age+"岁了。");
    }

    public static LazyStudent getInstace(){
        if(lazyStudent == null){
            lazyStudent = new LazyStudent();
        }

        return lazyStudent;
    }
}
