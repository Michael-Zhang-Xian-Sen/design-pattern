package FacadePattern;

public class Facade {
    SubSystem1 subSystem1;
    SubSystem2 subSystem2;
    SubSystem3 subSystem3;

    Facade() {
        subSystem1 = new SubSystem1();
        subSystem2 = new SubSystem2();
        subSystem3 = new SubSystem3();
    }

    public void method1(){
        subSystem1.ss1Method();
        subSystem3.ss3Method();
    }

    public void method2(){
        subSystem2.ss2Method();
        subSystem3.ss3Method();
    }

    public void method3(){
        subSystem1.ss1Method();
        subSystem2.ss2Method();
        subSystem3.ss3Method();
    }
}
