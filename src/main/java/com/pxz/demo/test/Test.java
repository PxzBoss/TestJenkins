package com.pxz.demo.test;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author PXZ
 * @Title: Test
 * @ProjectName demo
 * @date 2020/6/30 16:44
 */
public class Test {
    public static void main(String[] args) {


        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("a", 1);

        Object o = hashMap.get("a");

        System.out.println(o);
       /* Hashtable<Object, Object> hashtable = new Hashtable<>();

        hashtable.put("a", 1);

        hashtable.get("a");*/
    }
}
