package wanghang.javadatastructure.map;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**

 ConcurrentHashMap源码剖析:
 帝都的雁： JDK1.8ConcurrentHashMap源码,紧紧之后put的过程分析
 https://blog.csdn.net/yxh13521338301/article/details/105598561


 ConcurrentHashMap 1.7的源码分析,这里面有分段锁的概念:
 https://www.cnblogs.com/chengxiao/p/6842045.html

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
