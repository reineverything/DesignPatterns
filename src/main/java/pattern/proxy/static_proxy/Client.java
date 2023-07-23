package pattern.proxy.static_proxy;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/20 9:59
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
