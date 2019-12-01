package TemplateMethod;

public class Client {
    public static void main(String[] args) {
        AbstractClass language = new Vue();
        language.templateMethod();

        language = new Java();
        language.templateMethod();
    }
}
