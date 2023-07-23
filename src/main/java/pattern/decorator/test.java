package pattern.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName test
 * @Author shuai
 * @create 2023/7/23 14:40
 * @Instruction
 */
public class test {
    public static void main(String[] args) throws FileNotFoundException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("d:\\a.txt"));
        //FileInputStream的父类InputStream是一个抽象类，相当于快餐店
        //FileInputStream相当于炒饭，DataInputStream相当于鸡蛋，具体的装饰者
        //FileInputStream的父类FilterInputStream就是装饰者角色
    }
}
