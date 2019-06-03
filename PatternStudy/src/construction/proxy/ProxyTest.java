package construction.proxy;

/**
 * 代理类
 */
public class ProxyTest implements Subject{
    private RealSubject realSubject;
    @Override
    public void request() {
        if (realSubject==null){
            realSubject = new RealSubject();
        }
        //前置增强
        perRequest();
        //被增强对象原始方法
        realSubject.request();
        //后置增强
        postRequest();
    }

    public void perRequest(){
        System.out.println("前置增强");
    }
    public void postRequest(){
        System.out.println("后置增强");
    }
}
