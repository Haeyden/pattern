package build.builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcretenBuilder1();
        Dicector dicector = new Dicector(builder);
        Product pr = dicector.construct();
        pr.show();
    }
}
