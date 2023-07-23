package pattern.proxy.static_proxy;

/**
 * @ClassName TeacherDaoProxy
 * @Author shuai
 * @create 2023/7/20 9:59
 * @Instruction
 */
public class TeacherDaoProxy implements ITeacherDao{

    //通过接口聚合TeacherDao
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao teacherDao){
        this.target=teacherDao;
    }
    @Override
    public void teach() {
        //这里可以实现对功能的拓展
        System.out.println("代理开始");
        target.teach();
        System.out.println("代理结束");
    }
}
