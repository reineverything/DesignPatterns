package adapter.interface_adapter;

/**
 * @ClassName AbsAdapter
 * @Author shuai
 * @create 2023/7/19 11:04
 * @Instruction 抽象类实现接口中所有方法
 */
public abstract class AbsAdapter implements I {
    @Override
    public void m1() {}//唯一需要被使用的方法

    @Override
    public void m2() {}

    @Override
    public void m3() {}

    @Override
    public void m4() {}
}
