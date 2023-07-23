package pattern.factory.simpleFactory;


//咖啡工厂能够生产咖啡
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){

        Coffee coffee;
        if("american".equals(type)){
            coffee= new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee=new LatteCoffee();
        }else{
            throw new RuntimeException("抱歉，你点的咖啡种类没有");
        }

        return coffee;
    }
}
