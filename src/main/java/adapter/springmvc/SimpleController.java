package adapter.springmvc;

/**
 * @ClassName SimpleController
 * @Author shuai
 * @create 2023/7/19 15:34
 * @Instruction
 */
public class SimpleController implements Controller{

    public void doSimpleController(){
        System.out.println("httpController");
    }
}
