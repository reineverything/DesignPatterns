package pattern.decorator;

/**
 * @ClassName FastFood
 * @Author shuai
 * @create 2023/7/22 10:20
 * @Instruction 快餐类，属于抽象构建角色
 */
public abstract class FastFood {

    private float price;//价格
    private String desc;//描述

    public FastFood(){

    }
    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    //计算价格方法
    public abstract float cost();
}
