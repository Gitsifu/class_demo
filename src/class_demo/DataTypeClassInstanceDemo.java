package class_demo;

/**
 * Created by sifu on 2017/3/27.
 */
public class DataTypeClassInstanceDemo {
    public static void main(String[] args){
        //9大基本数据类型的字节码对像（包括void）
        Class booleanClass = boolean.class;
        Class intClass = int.class;

        //Integer.class和int.class相同吗？false，得出Integr和int是不同的数据类型
        System.out.println(Integer.class== int.class);//false
        System.out.println(Integer.TYPE == int.class);//true
        /*
        如何来表示数组的Class实例
            方式一：数组类型.class;
            方式二：数组对象.getClass();
         */
        int[] arr1 = {1,2,3};
        float[] arrf = {1.1f,1.4f,1.5f};
        Class clz1 = arr1.getClass();
        Class<int[]> clz = int[].class;
        Class clzf1 = arrf.getClass();
        Class<float[]> clzf2 = float[].class;
        System.out.println(clz);
        System.out.println(clz1);//  class [I
        System.out.println(clzf1);
        System.out.println(clzf2);//  class [F
    }
}
