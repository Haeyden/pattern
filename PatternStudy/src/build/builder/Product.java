package build.builder;

/**
 *创建的产品
 */
public class Product {
    private String patrA;
    private String patrB;
    private String patrC;

    public void setPatrA(String patrA) {
        this.patrA = patrA;
    }

    public void setPatrB(String patrB) {
        this.patrB = patrB;
    }

    public void setPatrC(String patrC) {
        this.patrC = patrC;
    }
    public void show(){
        System.out.println(patrA+" | "+patrB+" | "+patrC);
    }
}
