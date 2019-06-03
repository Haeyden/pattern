package construction.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        RealSubject ss = (RealSubject) Proxy.newProxyInstance(real.getClass().getClassLoader(), real.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("前置");
                Object invoke = method.invoke(proxy, args);
                System.out.println("后置");
                return invoke;
            }
        });
        ss.request();
    }
}
