package construction.adapter;

/**
 * 适配器类
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        spectificRequest();
    }
}
