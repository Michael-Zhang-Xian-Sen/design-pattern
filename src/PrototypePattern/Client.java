package PrototypePattern;

import java.io.IOException;

public class Client {
    /**
     * 实际上java也提供了Cloneable接口。无需这么麻烦了。
     * @param args
     * @throws CloneNotSupportedException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student student1 = new Student();

        student1.setAge(22);
        student1.setName("张浩");
        student1.show();

        Student student2 = student1.clone();

        student2.setName("马小花");
        student2.show();

        Student student3 = student1.deepClone();
        student3.setName("孟童");
        student3.show();

        System.out.println("以下是所有人：");
        student1.show();
        student2.show();
        student3.show();
    }
}
