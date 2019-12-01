package ObserverPattern;

public class Client {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("周冬雨",22);
        Student student1 = new Student("张浩",22,teacher);
        Student student2 = new Student("马小花",22,teacher);

        teacher.introduce();
        teacher.Attach(student1);
        teacher.Attach(student2);
        teacher.notifyObserver();
    }
}