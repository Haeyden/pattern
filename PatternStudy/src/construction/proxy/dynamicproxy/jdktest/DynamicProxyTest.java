package construction.proxy.dynamicproxy.jdktest;

import construction.proxy.dynamicproxy.Person;
import construction.proxy.dynamicproxy.Student;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        Student student = new Student();
        Person o = (Person) Proxy.newProxyInstance(student.getClass().getClassLoader(),
                student.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("前置增强");
                        Object invoke = method.invoke(student, args);
                        System.out.println("后置增强");
                        return invoke;
                    }
                });
        o.speak();

    }
}
