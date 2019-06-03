package construction.adapter;

public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("适配者模式测试");
        Target target = new ClassAdapter();
        target.request();
    }
}
