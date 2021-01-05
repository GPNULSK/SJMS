package factory.factoryB;

public class MainTest {
    public static void main(String[] args) {
        //通过具体工厂1获取具体产品1的对象，并调用
        Factory1 factory1 = new Factory1();
        BProdct product1 = factory1.createProduct();
        product1.sayHi();

        //2
        Factory2 factory2 = new Factory2();
        BProdct product2 = factory2.createProduct();
        product2.sayHi();
    }
}
