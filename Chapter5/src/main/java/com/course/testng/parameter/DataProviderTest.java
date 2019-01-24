package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){

        System.out.println("name = "+name+"; age="+age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] obj = new Object[][]{
                {"zhangsan",15},
                {"lisi",18},
                {"wangwu",26}
        };
        return obj;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法 name="+name +";age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法 name="+name +";age="+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][]  result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",54},
                    {"zhaoliu",61}
            };
        }
        return result;
    }
}
