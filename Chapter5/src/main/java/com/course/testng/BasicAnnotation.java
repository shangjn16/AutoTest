package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){

        System.out.println("------------------Test1-----------------------");
    }
    @Test
    public void testCase2(){
        System.out.println("------------------Test2-----------------------");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("------------------BeforeMetohd----------------");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("------------------AfterMethod-----------------");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("------------------BeforeClass-----------------");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("------------------AfterClass------------------");
    }
}
