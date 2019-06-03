package construction.adapter;

public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.print("对象适配器测试:  ");
        adaptee.spectificRequest();

    }
}
