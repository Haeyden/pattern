package build.builder;

public class ConcretenBuilder1 extends Builder {
    //product 是继承自父类中的对象

    @Override
    public void buildPartA() {
        System.out.println("第一个构建者对象");
        product.setPatrA("第一个构建对象设置 A");
    }

    @Override
    public void buildPartB() {
        System.out.println("第二个构建者对象");
        product.setPatrB("第二个构建对象设置 B");
    }

    @Override
    public void buildPartC() {
        System.out.println("第三个构建者对象");
        product.setPatrC("第三个构建对象设置 C");
    }
}
