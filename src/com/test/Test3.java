package com.test;

import com.demo.Test2;
import com.utils.Test;

/**
 * @author Ranger
 * @create 2019-08-27 9:04
 */
public class Test3 {

    public static void main(String[] args) {
        Test3 t = new Test3(0);
        t.test();
        int num = t.getNum();
        System.out.println("num = " + num);
        Test.testPush();

    }



    public Test3(int i){
        i = 0;
    }

    public void test(){
        System.out.println("hello word!");
    }

    public int getNum(){
        return 1;
    }

}
