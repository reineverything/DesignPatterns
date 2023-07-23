package pattern.factory.factory_method;

/**
 * 美式咖啡具体工厂对象
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
