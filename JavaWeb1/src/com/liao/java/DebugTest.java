package com.liao.java;

import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
        HashMap<String,String> map = new HashMap<>();
        map.put("username","张三");
        map.put("age","20");
        map.put("school","PKU");
        map.put("major","Science");

        String major = map.get("major");
        System.out.println("major"+major);

    }
}
