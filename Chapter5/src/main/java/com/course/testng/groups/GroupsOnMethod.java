package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端11111111111111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端22222222222222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端33333333333333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端44444444444444");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端运行前");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务端运行后");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("客户端运行前");
    }
    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("客户端运行后");
    }
}
