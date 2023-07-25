package action.template;

/**
 * @ClassName ConcreteClass_BaoCai
 * @Author shuai
 * @create 2023/7/24 21:47
 * @Instruction 具体实现类：炒包菜
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("放入包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("放入辣椒和盐醋");

    }
}
