package wanghang.juc;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *ConcurrentHashMap源码分析：
 *
 *
 *
 */
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        Map<String,Object> concurrentHashMap=new ConcurrentHashMap();
        concurrentHashMap.put("a",1);
        concurrentHashMap.put("b",2);
        concurrentHashMap.put("c",3);
        concurrentHashMap.put("d",4);
        System.out.println("concurrentHashMap:"+concurrentHashMap);
    }
}
