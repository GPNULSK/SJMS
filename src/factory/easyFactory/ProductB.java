package factory.easyFactory;

/**
 * 简单工厂模式
 * 具体产品2
 */
public class ProductB implements Product {
    @Override
    public void sayHi() {
        System.out.println("我是类B");
    }
}
