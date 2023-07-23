package pattern.singleton.demo7;


import java.io.*;

/**
 * 通过序列化和反序列话的方式破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObject2File();
        readObjectFile();
        readObjectFile();
    }

    public static void writeObject2File() throws IOException {

        //创建文件输出流
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\shuai\\Desktop\\a.txt"));
        oos.writeObject(Singleton.getInstance());
        oos.close();
    }

    public static void readObjectFile() throws IOException, ClassNotFoundException {
        //创建文件输入流
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\shuai\\Desktop\\a.txt"));
        Singleton object = (Singleton)ois.readObject();
        System.out.println(object);
        ois.close();
    }
}
