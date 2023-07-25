package action.responsity;

/**
 * @ClassName Client
 * @Author shuai
 * @create 2023/7/25 10:27
 * @Instruction
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("张三", 1, "身体不适");

        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManger generalManger = new GeneralManger();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManger);

        //处理开始
        groupLeader.submit(leaveRequest);
    }
}
