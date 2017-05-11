package method_invoke;

import java.lang.reflect.Method;


/**
 * Created by sifu on 2017/4/8.
 */
//通过反射调用方法
class Person {
    public void doWork() {
        System.out.println("Person.doWork()");
    }

    public static void doWork(String name) {
        System.out.println("Person.doWork()" + name);
    }

    private String doWork(String name, int age) {
        System.out.println("Person.doWork()" + name + "," + age);
        return "Person.doWork()" + name + "," + age;
    }
}

public class MethodInvokeDemo {
    public static void main(String[] args) throws Exception {
        //获取类的字节码对象
        Class<Person> personClass = Person.class;
        //获取指定方法
        Method m = personClass.getMethod("doWork");
        //执行此方法
        m.invoke(personClass.newInstance());
        //获取private修饰的方法
        m = personClass.getDeclaredMethod("doWork", String.class, int.class);
        //设置可以访问权限
        m.setAccessible(true);
        m.invoke(personClass.newInstance(), "sifu", 19);
    }
}
