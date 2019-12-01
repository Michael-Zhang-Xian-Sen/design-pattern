package PrototypePattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式虽然是创建型的模式，但是与工程模式没有关系，从名字即可看出，该模式的思想就是将一个
 对象作为原型，对其进行复制、克隆，产生一个和原对象类似的新对。在 Java 中，复制对象是通过 clone()实现的
 实现深复制需要实现Serializable 可以序列化 不然没法序列化对象去进行流的输入输出
 *  这个文件其实没有用到。
 */
public abstract class Prototype implements  Cloneable,Serializable {
    /**
     * 浅复制
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
	/*	Prototype prot = (Prototype) super.clone();
		return prot;*/
        return super.clone();
    }

    /**
     * 深复制
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
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
        return ois.readObject();
    }
}