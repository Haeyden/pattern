package build.prototype;

public interface Shape extends Cloneable {
    Object clone();
    //计算面积
    void countArea();
}
