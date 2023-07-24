package action.iterator;

import java.util.List;

/**
 * @ClassName StudentIterator
 * @Author shuai
 * @create 2023/7/24 20:32
 * @Instruction 迭代器角色类
 */
public class StudentIteratorImpl implements IStudentIterator{

    private List<Student> list;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    private int position;//记录遍历时的位置
    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的元素
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
