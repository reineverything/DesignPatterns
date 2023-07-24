package action.iterator;

/**
 * @ClassName IStudentIterator
 * @Author shuai
 * @create 2023/7/24 20:30
 * @Instruction 抽象迭代器角色接口
 */
public interface IStudentIterator {

    //判断是否还有元素
    boolean hasNext();

    //获取下一个元素
    Student next();
}
