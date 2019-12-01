package VisitorPattern;

public class ConcreteVisitorA extends Visitor {
    public void getManConclusion(ConcreteElementA concreteElementA){
        System.out.println("男人成功时，背后多半有一个伟大的女人");
    }

    public void getWomanConclusion(ConcreteElementB concreteElementB){
        System.out.println("女人成功时，背后多半又一个不成功的男人");
    }
}
