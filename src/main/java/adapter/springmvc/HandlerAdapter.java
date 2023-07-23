package adapter.springmvc;

/**
 * @ClassName HandlerAdapter
 * @Author shuai
 * @create 2023/7/19 15:38
 * @Instruction
 */
public interface HandlerAdapter {

    //handler和Controller可以理解成一样

    void handle(Object handler);

    boolean supports(Object handler);
}
