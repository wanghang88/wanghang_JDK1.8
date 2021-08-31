package wanghang.javadatastructure.list;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * CopyOnWriteArrayList源码分析
 *
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
