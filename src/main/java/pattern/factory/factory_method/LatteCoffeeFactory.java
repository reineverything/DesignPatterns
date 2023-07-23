package pattern.factory.factory_method;

/**
 * 拿铁咖啡具体工厂对象
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
