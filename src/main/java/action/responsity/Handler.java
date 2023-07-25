package action.responsity;

/**
 * @ClassName Handler
 * @Author shuai
 * @create 2023/7/25 10:04
 * @Instruction 抽象处理者
 */
public abstract class Handler {

    protected final static int NUM_ONE=1;
    protected final static int NUM_THREE=3;
    protected final static int NUM_SEVEN=7;

    //定义处理者可以处理的天数区间
    private int numStart;
    private int numEnd;

    //声明当前角色
    private String current;
    //声明后继者
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handler(int numStart, int numEnd, String current) {
        this.numStart = numStart;
        this.numEnd = numEnd;
        this.current = current;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }


    //处理请假条的方式请假条
    public final void submit(LeaveRequest leaveRequest){
        if(leaveRequest.getNum()<=this.numEnd){
            System.out.println(this.current+"审批通过");
            System.out.println("流程结束");
        }else if(this.nextHandler != null && leaveRequest.getNum()>this.numEnd){
            nextHandler.submit(leaveRequest);
        }else{
            System.out.println("流程结束");
        }


    }

}
