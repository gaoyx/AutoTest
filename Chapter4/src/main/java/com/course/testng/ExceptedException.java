package com.course.testng;

import org.testng.annotations.Test;

public class ExceptedException {

   //这是一个测试结果会失败的异常测试

    @Test(expectedExceptions = RuntimeException.class)
   public  void runTimeExceptinFailed(){
       System.out.println("失败的测试");
   }

    //这是一个测试结果会成功的异常测试

    @Test(expectedExceptions = RuntimeException.class)
    public  void runTimeExceptinSuccess(){
        System.out.println("异常的测试");
        throw new RuntimeException();
    }
}
