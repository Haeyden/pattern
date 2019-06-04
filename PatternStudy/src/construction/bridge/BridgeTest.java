package construction.bridge;

public class BridgeTest {
    public static void main(String[] args) {
        ConcreteImplementorA imple = new ConcreteImplementorA();
        RefineAbstarction refineAbstarction = new RefineAbstarction(imple);
        refineAbstarction.Operation();
    }
}
