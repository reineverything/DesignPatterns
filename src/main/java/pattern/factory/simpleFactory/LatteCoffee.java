package pattern.factory.simpleFactory;

import pattern.factory.simpleFactory.Coffee;

/**
 * 创建拿铁咖啡子类
 */
public class LatteCoffee extends Coffee {
    @Override
    public String getName() {
        return "拿铁咖啡";
    }
}
