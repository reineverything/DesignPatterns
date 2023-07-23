package adapter.springmvc;

/**
 * @ClassName HttpHandlerAdapter
 * @Author shuai
 * @create 2023/7/19 15:40
 * @Instruction
 */
public class HttpHandlerAdapter implements HandlerAdapter{
    @Override
    public void handle(Object handler) {

    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpHandlerAdapter);
    }
}
