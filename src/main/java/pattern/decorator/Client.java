package pattern.decorator;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/22 10:56
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {
        //点炒饭
        FastFood food = new FiredRice();
        System.out.println(food.getDesc() + "的价格是" + food.cost());
        System.out.println("---------------------------------------");

        //在上面的炒饭中加个鸡蛋
        food=new Egg(food);
        System.out.println(food.getDesc() + "的价格是" + food.cost());
    }
}
