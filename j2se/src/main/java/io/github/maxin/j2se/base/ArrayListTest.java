package io.github.maxin.j2se.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("HAHAHAHA");

        //第一种遍历方法使用foreach遍历List
        for (String str:list){
            System.out.println(str);
        }

        //第二种遍历方法，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for (int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }

        //第三种遍历方法，使用迭代器进行相关遍历
        Iterator<String> ite=list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
