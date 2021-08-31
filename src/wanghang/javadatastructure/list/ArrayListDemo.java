package wanghang.javadatastructure.list;


import java.util.ArrayList;
import java.util.List;

/**
  ArrayList源码分析：

 帝都的雁：源码分析ArrayList、LinkedList和Vector（有详细的分析,并且最后还有总结）
 https://blog.csdn.net/yxh13521338301/article/details/105511053

 */
public class ArrayListDemo {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("list:"+list);
    }
}
