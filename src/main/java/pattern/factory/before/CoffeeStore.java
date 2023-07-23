package pattern.factory.before;

/**
 * 咖啡店用于订购咖啡
 */
public class CoffeeStore {

    //根据类型订购咖啡
    public Coffee orderCoffee(String type){

        Coffee coffee;
        if("american".equals(type)){
            coffee=new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee=new LatteCoffee();
        }else{
            throw new RuntimeException("对不起，还没有这种类型的咖啡");
        }

        //加配料
        coffee.addSugar();
        coffee.addMilk();
        return coffee;
    }
}
