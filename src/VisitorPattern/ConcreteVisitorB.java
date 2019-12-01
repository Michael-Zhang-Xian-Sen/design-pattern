package VisitorPattern;

public class ConcreteVisitorB extends Visitor{
    public void getManConclusion(ConcreteElementA concreteElementA){
        System.out.println("男人失败时，闷头喝酒，谁也不用劝");
    }

    public void getWomanConclusion(ConcreteElementB concreteElementB){
        System.out.println("女人失败时，眼泪汪汪，谁也劝不了");
    }
}
