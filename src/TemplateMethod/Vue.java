package TemplateMethod;

public class Vue extends AbstractClass {
    public void build(){
        System.out.println("执行npm run build");
    }

    public void run(){
        System.out.println("执行npm run serve");
    }
}
