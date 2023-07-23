package pattern.factory.staticSimpleFactory;

public class CoffeeStore {

    public void orderCoffee(String type){
//        SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
//        Coffee coffee = simpleCoffeeFactory.createCoffee(type);
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}
