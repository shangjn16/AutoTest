package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionSuccess(){
        System.out.println("这是测试异常");
        throw new RuntimeException();
    }
}
