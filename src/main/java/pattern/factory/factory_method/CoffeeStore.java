package pattern.factory.factory_method;

/**
 * @ClassName CoffeeStore
 * @Author rein
 * @create 2023/7/17 9:44
 */
public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    //通过set方法设置具体咖啡工厂类型
    public void setCoffeeFactory(CoffeeFactory coffeeFactory){
        this.coffeeFactory=coffeeFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
