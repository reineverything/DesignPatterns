package pattern.proxy.static_proxy;

/**
 * @ClassName TeacherDao
 * @Author shuai
 * @create 2023/7/20 9:58
 * @Instruction
 */
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("老师上课");
    }
}
