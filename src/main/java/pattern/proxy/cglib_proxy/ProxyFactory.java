package pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ClassName ProxyFactory
 * @Author shuai
 * @create 2023/7/22 9:13
 * @Instruction 获取代理类，是目标对象所属类的子类（继承）
 */
public class ProxyFactory implements MethodInterceptor {

    //声明火车站对象
    private TeacherDao teacherDao=new TeacherDao();
    public TeacherDao getProxyObject(){
        //创建Enhancer类，类似于JDK中Proxy类
        Enhancer enhancer=new Enhancer();

        //设置父类的字节码对象
        enhancer.setSuperclass(TeacherDao.class);
        //设置回调函数
        enhancer.setCallback(this);//这个函数传递的是methodInterceptor子实现类的对象

        //创建代理对象
        TeacherDao proxyObject = (TeacherDao) enhancer.create();
        return proxyObject;
    }

    /**
     * @param o 代理对象
     * @param method 对应调用方法的method对象
     * @param objects 实际参数
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理开始");

        //通过反射来执行方法
        Object obj = method.invoke(teacherDao, objects);//相当于调用teach，返回值null
//        teacherDao.teach();
        return obj;
    }
}
