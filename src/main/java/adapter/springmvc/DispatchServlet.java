package adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DispatchServlet
 * @Author shuai
 * @create 2023/7/19 15:42
 * @Instruction
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
    }

    public void doDispatch() {

        //此处模拟springmvc从request获取的handler对象
        AnnotationController controller = new AnnotationController();

        //通过controller获取对应的adapter
        HandlerAdapter handler = getHandler(controller);//annotationHandlerAdapter
        handler.handle(controller);

    }

    public HandlerAdapter getHandler(Controller controller) {
        //根据controller返回对应的adapter类
        for (HandlerAdapter handlerAdapter : handlerAdapters
        ) {
            if (handlerAdapter.supports(controller)) {
                return handlerAdapter;
            }
        }

        throw new RuntimeException("没有匹配的适配器");
    }
}