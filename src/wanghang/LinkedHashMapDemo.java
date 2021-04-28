package wanghang;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *LinkedHashMap源码解析：
 *1)LinkedHashMap继承HashMap
 *
 *
 *
 */
public class LinkedHashMapDemo {


    public static void main(String[] args) {
        Map<String,Object> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put("a",1);
        linkedHashMap.put("b",2);
        linkedHashMap.put("c",3);
        linkedHashMap.put("d",4);
        linkedHashMap.put("e",5);
        System.out.println("linkedHashMap:"+linkedHashMap);
    }
}
