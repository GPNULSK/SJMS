package factory.factoryB;

/**
 * 具体工厂2，负责创建具体产品2对象
 */
public class Factory2 implements Factory {
    @Override
    public BProdct createProduct() {
        return new BProduct2();
    }
}
