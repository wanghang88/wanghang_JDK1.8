package wanghang;

import java.util.HashMap;
import java.util.Map;

/**
 *HashMap源码分析
 *
 *
 *
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        System.out.println(map);
    }
}
