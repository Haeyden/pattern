package construction.proxy.dynamicproxy.cjlibtest;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CJLib 实现的动态代理
 * <p>
 * 目标类不能是final的
 * 对象方法不能是final static的   会被拦截
 */
public class ProxyFactory implements MethodInterceptor {
    private Object object;

    public ProxyFactory(Object target) {
        this.object = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(object.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类
        return enhancer.create();
    }

    /**
     * 定义拦截器 在调用目标方法时 CGlib回调MethodInterceptor接口方法拦截
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("前置方法");
        Object invoke = method.invoke(o, objects);
        System.out.println("后置方法");
        return invoke;
    }
}
