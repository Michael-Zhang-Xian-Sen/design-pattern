package DecoratorPattern;

/**
 * 原始的、被装饰的类。和装饰类继承同一个类。
 */
public class ConcreteComponent extends Component {
    public void Operation(){
        // 这是原始的操作
        System.out.println("我是原始类，我的这个方法想要被装饰一下。");
    }
}
