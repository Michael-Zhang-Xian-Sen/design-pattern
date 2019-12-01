package TemplateMethod;

public abstract class AbstractClass {
    public abstract void build();
    public abstract void run();
    public void templateMethod(){
        build();
        run();
        System.out.println("完成！");
    }
}
