package action.iterator;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/24 20:46
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("张三","123"));
        studentAggregate.addStudent(new Student("李四","124"));
        studentAggregate.addStudent(new Student("王五","125"));
        StudentIteratorImpl studentIterator = studentAggregate.getStudentIterator();

        //遍历
        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }

    }
}
