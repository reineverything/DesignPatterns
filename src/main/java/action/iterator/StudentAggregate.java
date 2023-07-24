package action.iterator;

/**
 * @ClassName StudentAggregate
 * @Author shuai
 * @create 2023/7/24 20:37
 * @Instruction 抽象聚合角色
 */
public interface StudentAggregate {

    //添加学生功能
    void addStudent(Student stu);

    //删除学生功能
    void remStudent(Student stu);

    //获取迭代器对象功能
    StudentIteratorImpl getStudentIterator();
}
