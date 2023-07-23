package pattern.factory.factory_method;



/**
 * @ClassName Client
 * @Author rein
 * @create 2023/7/17 9:50
 */
public class Client {
    public static void main(String[] args) {

        //实现订购咖啡功能
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.setCoffeeFactory(new AmericanCoffeeFactory());//这里选择具体的咖啡工厂
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
