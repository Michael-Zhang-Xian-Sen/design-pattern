package TemplateMethod;

public class Java extends AbstractClass{
    public void build(){
        System.out.println("编译Java文件");
    }

    public void run(){
        System.out.println("虚拟机执行Java字节码文件");
    }
}
