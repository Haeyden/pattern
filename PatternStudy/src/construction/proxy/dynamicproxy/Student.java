package construction.proxy.dynamicproxy;

public class Student implements Person {
    @Override
    public void speak() {
        System.out.println("学生要学习");
    }
}
