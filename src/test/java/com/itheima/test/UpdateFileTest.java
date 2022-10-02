package com.itheima.test;

import org.junit.jupiter.api.Test;

public class UpdateFileTest {

    @Test
    public void test1(){
        String fileName = "abc.jpg";
        String s = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(s);
    }
}
