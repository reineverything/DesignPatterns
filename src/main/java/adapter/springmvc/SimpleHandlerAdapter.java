package adapter.springmvc;

/**
 * @ClassName SimpleHandlerAdapter
 * @Author shuai
 * @create 2023/7/19 15:40
 * @Instruction
 */
public class SimpleHandlerAdapter implements HandlerAdapter{
    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimpleController();
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }
}
