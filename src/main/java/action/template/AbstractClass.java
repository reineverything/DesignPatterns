package action.template;

/**
 * @ClassName AbstractClass
 * @Author shuai
 * @create 2023/7/24 21:41
 * @Instruction 抽象类，定义模板方法和基本方法
 */
public abstract class AbstractClass {

    //模板方法定义，规定了之后就不能变动，设置final
    public final void cookProcess(){
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }
    public void pourOil(){
        System.out.println("倒油");
    }

    public void heatOil(){
        System.out.println("热油");
    }

    //不同的菜倒不同的菜
    public abstract void pourVegetable();

    //不同的菜放的调料不同
    public abstract void pourSauce();

    public void fry(){
        System.out.println("炒菜");
    }
}
