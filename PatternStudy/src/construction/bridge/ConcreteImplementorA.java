package construction.bridge;

/**
 * 具体实现化角色A
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void OperationImpl() {
        System.out.println("具体实现化角色A 被访问 |");
    }
}
