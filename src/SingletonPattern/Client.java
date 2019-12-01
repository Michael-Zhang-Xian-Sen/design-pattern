package SingletonPattern;

public class Client {
    public static void main(String[] args) {
        // 懒汉式
        System.out.println("\n下面采用懒汉式");
        LazyStudent lazyStudent1 = LazyStudent.getInstace();
        lazyStudent1.setName("张浩");
        lazyStudent1.setAge(22);
        lazyStudent1.showInfo();

        LazyStudent lazyStudent2 = LazyStudent.getInstace();
        lazyStudent2.setName("马小花");
        lazyStudent2.setAge(22);
        lazyStudent2.showInfo();

        System.out.println("两个人分别是");
        lazyStudent1.showInfo();
        lazyStudent2.showInfo();

        // 饿汉式
        System.out.println("\n下面采用饿汉式");
        EagerStuent eagerStuent1 = EagerStuent.getInstance();
        eagerStuent1.setName("张浩");
        eagerStuent1.setAge(22);
        eagerStuent1.showInfo();

        EagerStuent eagerStuent2 = EagerStuent.getInstance();
        eagerStuent2.setName("马小花");
        eagerStuent2.setAge(22);
        eagerStuent2.showInfo();

        System.out.println("两个人分别是");
        lazyStudent1.showInfo();
        lazyStudent2.showInfo();

        System.out.println("\n可得结论\n每个单例类，整个程序只有该类的一个实例。");
    }
}
