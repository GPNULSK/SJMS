package factory.factoryB;

/**
 * 具体工厂1.负责创建具体产品1
 */
public class Factory1 implements Factory {
    @Override
    public BProdct createProduct() {
        return new BProduct1();
    }
}
