package ObserverPattern;

public class Student extends Observer{
    private String name;
    private Integer age;


    Student(String name,Integer age,Subject subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void notifyObserver(){
        System.out.println("报道！我叫"+name+"，今年"+age+"岁。");
    }
}
