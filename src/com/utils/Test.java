/**
 * @author Ranger
 * @create 2019-08-26 22:04
 */
public class Test {

   public static void main(String[] args){
        System.out.println("args = " + args);
        Test.testPush();
        test2();

        testPush();
        test1();
    }

    public static void testPush(){
        System.out.println("true = " + true);
    }

    public static void test2(){
        System.out.println("修改了代码");
    }

    public static void test1(){
        System.out.print("Today is monday");
    }
}
