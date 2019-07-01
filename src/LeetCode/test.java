package LeetCode;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        System.out.printf("before add:arrayList.size()=%d",arrayList.size());

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(9);

        System.out.println("after the size"+arrayList.size());
        System.out.println("printing elements of arraylist");
        System.out.println("通过迭代器遍历");
        Iterator it=arrayList.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("for循环遍历：");
        for (int number:arrayList){
            System.out.print(number+" ");
        }
        System.out.println();
        //toArray用法  第一种常用
//        Integer[]integers=arrayList.toArray(new Integer[0]);
//        arrayList.toArray(integers);
//        System.out.println(integers);

        Integer[]ints=new Integer[arrayList.size()];
        arrayList.toArray(ints);
        arrayList.add(2,2);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.remove((Object) 3);
        System.out.println(arrayList);
        //删除指定元素和指定位置上的元素
        //判断arraylist是否存在5
        System.out.println("ArrayList contains 5 is"+arrayList.contains(5));
        arrayList.clear();
        System.out.println(arrayList.isEmpty());
    }
}
