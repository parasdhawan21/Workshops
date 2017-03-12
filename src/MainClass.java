import jdk.internal.dynalink.beans.StaticClass;

/**
 * Created by PARAS on 12-03-2017.
 *
 * Playing with static
 */
public class MainClass {

    static int d;

    public static void main(String[] args) {

        System.out.println("Inside static");
        MainClass s1=new MainClass();
        MainClass s2=new MainClass();
        s1.a ++;
        System.out.println(s2.a);



    }
    MainClass (){

    System.out.println("Constructor");
    }
    static int a;
    static
    {
        System.out.println("Inside static block");

       a=2;
        System.out.println(a + " " +  d);
    }
}


