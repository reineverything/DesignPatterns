package pattern.factory.simpleFactory;

public class CoffeeStore {

    public void orderCoffee(String type){
        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        Coffee coffee = simpleCoffeeFactory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}
