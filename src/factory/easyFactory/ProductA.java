package factory.easyFactory;

/**
 * 简单工厂模式
 * 具体产品1
 */
public class ProductA implements Product {
    @Override
    public void sayHi() {
        System.out.println("我是类A");
    }
}
