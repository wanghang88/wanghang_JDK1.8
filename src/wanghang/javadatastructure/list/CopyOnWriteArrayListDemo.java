package wanghang.javadatastructure.list;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
  CopyOnWriteArrayList源码分析：

 CopyOnWriteArrayList实现的原理分析:
 https://www.cnblogs.com/chengxiao/p/6881974.html

 */
public class CopyOnWriteArrayListDemo {


    public static void main(String[] args) {
        List list=new CopyOnWriteArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("list:"+list);
    }
}
