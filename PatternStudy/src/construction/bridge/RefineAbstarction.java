package construction.bridge;

public class RefineAbstarction extends Abstraction {
    protected RefineAbstarction(Implementor imple) {
        super(imple);
    }

    @Override
    public void Operation() {
        System.out.println("扩展抽象化角色被访问");
        imple.OperationImpl();
    }
}
