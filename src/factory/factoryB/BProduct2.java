package factory.factoryB;

/**
 * 具体产品2
 */
public class BProduct2 implements BProdct {
    @Override
    public void sayHi() {
        System.out.println("我是工厂模式具体产品2");
    }
}
