package class_demo;

/**
 * Created by sifu on 2017/3/27.
 */
public class ClassDemo {
    public static void main(String[] args) throws Exception {
        //1.通过 类名.class 获取字节码对象
        Class<java.util.Date> date1 = java.util.Date.class;
        //2.通过 对象.getClass() 获取 该对象的类的字节码对象(getClass()是Object类中的方法)
        java.util.Date d = new java.util.Date();
        Class<?> date2 = d.getClass();
        //3.通过Class中的静态方法forName(String obj)获取该类的字节码对象
        Class<?> date3 = Class.forName("java.util.Date");
        System.out.println(date1 == date2);
        System.out.println(date1 == date3);
        System.out.println(date3 == date2);
    }
}
