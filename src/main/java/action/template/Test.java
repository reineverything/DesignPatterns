package action.template;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Test
 * @Author shuai
 * @create 2023/7/25 8:52
 * @Instruction
 */
public class Test {
    public static void main(String[] args) {

        /**
         * InputStream是一个抽象类，其中定义了多个read方法（重载）
         * 有些是抽象方法，但有些是具体实现方法
         */
        InputStream inputStream = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }
}
