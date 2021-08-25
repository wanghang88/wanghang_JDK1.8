package wanghang;

import java.util.HashMap;
import java.util.Map;

/**

 HashMap源码分析：
 
 java 8的HashMap操作,主要是关于put的操作,有详细的原理
 https://mp.weixin.qq.com/s/3SK251gv5w_Hnxy1oJPzhw



 //HashMap1.7源码剖析
 https://blog.csdn.net/yxh13521338301/article/details/105535513




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
