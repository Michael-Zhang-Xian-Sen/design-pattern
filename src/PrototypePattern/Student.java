package PrototypePattern;

import java.io.*;

public class Student implements Cloneable,Serializable {
    private static final long serialVersionUID = 1L;
    private Integer age;
    private String name;
    private Prototype prototype;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("我的名字是："+name+"。我今年"+age+"岁了。");
    }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    public Student deepClone() throws IOException, ClassNotFoundException {
        /**
         *  写入当前对象的二进制流
         */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /**
         * 写出当前对象二进制流
         */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois;
        ois = new ObjectInputStream(bis);
        return (Student) ois.readObject();
    }
}
