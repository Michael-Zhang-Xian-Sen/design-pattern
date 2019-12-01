package ObserverPattern;

public class Teacher extends Subject {
    private String name;
    private Integer age;

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

    Teacher(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("我是老师。我的名字叫："+this.name+"。我今年"+this.age+"岁。");
    }
}
