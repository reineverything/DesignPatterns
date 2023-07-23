package pattern.factory.simpleFactory;

public class Client {
    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.orderCoffee("latte");
    }
}
