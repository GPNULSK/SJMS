package factory.easyFactory;

public class MainTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product p = factory.createProduct("A");
        p.sayHi();
    }
}
