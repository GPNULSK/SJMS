package factory.easyFactory;

/**
 * 简单工厂模式
 * 具体工厂，没有抽象工厂
 */
public class Factory {
    Product product = null;

    public Product createProduct(String p){

        switch (p){
            case "A":
                product = new ProductA();
                break;

            case "B":
                product = new ProductB();
                break;
        }

        return product;
    }
}
