package pattern.proxy.dynamic;

/**
 * @ClassName TeacherDao
 * @Author shuai
 * @create 2023/7/20 15:53
 * @Instruction
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中");
    }
}
