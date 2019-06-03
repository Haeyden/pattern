package construction.proxy.dynamicproxy.cjlibtest;

import construction.proxy.dynamicproxy.Singer;
import construction.proxy.dynamicproxy.Student;

public class Test {
    public static void main(String[] args) {
        Singer singer = new Singer();

        ProxyFactory proxyFactory = new ProxyFactory(singer);

        Singer prsinger = (Singer) proxyFactory.getProxyInstance();

        prsinger.sing();

    }
}
