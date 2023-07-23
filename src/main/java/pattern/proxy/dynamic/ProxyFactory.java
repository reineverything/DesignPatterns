package pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyFactory
 * @Author shuai
 * @create 2023/7/20 16:08
 * @Instruction 用于生成动态代理对象
 */
public class ProxyFactory {

    private ITeacherDao teacherDao=new TeacherDao();

    public ITeacherDao getProxyObject(){

        /**
         * public static Object newProxyInstance(ClassLoader loader, //类加载器
         *                                           Class<?>[] interfaces,//代理类实现的接口的字节码对象
         *                                           InvocationHandler h)//代理对象的调用处理程序，其中InvocationHandler是一个接口，可以传入它的实现类
         */
        ITeacherDao proxyInstance = (ITeacherDao) Proxy.newProxyInstance(
                teacherDao.getClass().getClassLoader(),
                teacherDao.getClass().getInterfaces(),

                //动态代理关键的方法，在这里进行业务逻辑的处理
                new InvocationHandler() {//匿名内部类的方式
                    @Override
                    /**
                     * Object proxy：代理对象，和proxyInstance是同一个对象，在invoke中基本不用
                     * Method method：对接口中方法进行封装的方法
                     * Object[] args：调用方法的实际参数
                     * 返回值：方法的返回值
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理开始");
                        //执行目标对象的方法
                        Object obj = method.invoke(teacherDao, args);//通过反射执行
                        return obj;
                    }
                });
        return proxyInstance;
    }
}
