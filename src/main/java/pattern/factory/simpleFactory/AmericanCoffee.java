package pattern.factory.simpleFactory;

import pattern.factory.simpleFactory.Coffee;

/**
 * 创建美式咖啡子类
 */
public class AmericanCoffee extends Coffee {
    @Override
    public String getName() {
        return "美式咖啡";
    }
}