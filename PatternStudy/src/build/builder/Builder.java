package build.builder;

/***
 * 抽象建造者,包含创建各个子对象的抽象方法
 */
public abstract class Builder {
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    //返回产品对象
    public Product getResult(){
        return product;
    }
}
