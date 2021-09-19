package wanghang.javadatastructure.map;

import java.util.HashMap;
import java.util.Map;

/**

 HashMap源码分析：
 java 8的HashMap操作,主要是关于put的操作,有详细的原理
 https://mp.weixin.qq.com/s/3SK251gv5w_Hnxy1oJPzhw

 恐龙弟旺仔的博文,HashMap原理的介绍(也是基于java8的),
 包括:
 1,关于有关于哈希表的介绍,
 2,HashMap的存储解决方案,
 3,HashMap的结构分析,
 4,HashMap的构造方法,tableSizeFor()方法,
 5,添加操作,包括扩容resize()
 6,删除操作,
 7,查询操作。
 https://blog.csdn.net/qq_26323323/article/details/86219905

 JDK1.8HashMap的原理分析(主要从:存储结构,索引计算,put方法,扩容机制等全方位地分析HashMap),从面试的角度
 https://tech.meituan.com/2016/06/24/java-hashmap.html
 美团技术的分享:对与JDK1.8HashMap的原理分析;
 https://tech.meituan.com/2016/06/24/java-hashmap.html





 JDK 1.7源码分析(主要包括,
 什么是哈希表,HashMap的实现原理,
 为什么数组的长度一定是2的次幂,重写equals方法的同时需要重写hashCode方法，以及整个原理的总结)
 https://www.cnblogs.com/chengxiao/p/6059914.html

 //帝都的雁的博文,HashMap1.7源码剖析
 https://blog.csdn.net/yxh13521338301/article/details/105535513
 帝都的雁： 头插法会导致hashmap7扩容死循环而尾插法却不会
 https://blog.csdn.net/yxh13521338301/article/details/105629318









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
