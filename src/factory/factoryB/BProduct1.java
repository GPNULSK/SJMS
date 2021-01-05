package factory.factoryB;

/**
 * 具体产品1
 */
public class BProduct1 implements BProdct {
    @Override
    public void sayHi() {
        System.out.println("我是工厂模式的第一个具体产品");
    }
}
