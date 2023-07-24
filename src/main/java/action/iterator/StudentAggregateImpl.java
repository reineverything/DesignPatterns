package action.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentAggregateImpl
 * @Author shuai
 * @create 2023/7/24 20:41
 * @Instruction
 */
public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> list=new ArrayList<>();
    @Override
    public void addStudent(Student stu) {
        list.add(stu);
    }

    @Override
    public void remStudent(Student stu) {
        list.remove(stu);
    }

    //获取迭代器对象
    @Override
    public StudentIteratorImpl getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
