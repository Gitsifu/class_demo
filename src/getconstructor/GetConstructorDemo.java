package getconstructor;

import java.lang.reflect.Constructor;

/**
 * Created by sifu on 2017/4/8.
 */
//获取类中的构造器
class User {
    String name;
    int age;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class GetConstructorDemo {
    public static void main(String[] args)throws Exception {
        //获取所有构造器
        //text1();
        //获取public的构造器
        //text2();
        //获取指定public的构造器
        //text3();
        //获取指定的构造器
        text4();
    }

    private static void text4() throws Exception {
        Class<User> userClass = User.class;
        Constructor<User> uc = userClass.getDeclaredConstructor(String.class,int.class);
        System.out.println(uc);
    }

    private static void text3() throws Exception {
        Class<User> userClass = User.class;
        Constructor<User> uc = userClass.getConstructor(String.class);
        System.out.println(uc);

    }

    private static void text2() {
        Class<User> userClass = User.class;
        Constructor[] uc = userClass.getConstructors();
        for(Constructor s : uc){
            System.out.println(s);
        }
    }

    public static void text1(){
        Class<User> userClass = User.class;
        Constructor[] uc = userClass.getDeclaredConstructors();
        for(Constructor s : uc){
            System.out.println(s);
        }
    }
}


