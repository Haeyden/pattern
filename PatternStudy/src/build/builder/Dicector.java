package build.builder;


/**
 * 指挥者
 * 调用建造者中的方法完成复杂对象的创建
 */
public class Dicector {

    private Builder builder;

    //构造方法
    public Dicector(Builder builder){
        this.builder = builder;
    }
    //产品构建与组装方法
    //指挥构建者组建产品对象,返回产品
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
