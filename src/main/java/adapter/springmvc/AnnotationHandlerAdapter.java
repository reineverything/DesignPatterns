package adapter.springmvc;

/**
 * @ClassName AnnotationHandlerAdapter
 * @Author shuai
 * @create 2023/7/19 15:39
 * @Instruction
 */
public class AnnotationHandlerAdapter implements HandlerAdapter{
    @Override
    public void handle(Object handler) {
    }

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationHandlerAdapter);
    }
}
