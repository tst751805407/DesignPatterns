package LeetCode;

import java.util.Iterator;
import java.util.LinkedList;

public class test2 {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<Integer>();
        linkedList.addFirst(0);
        linkedList.add(1);
        linkedList.add(2,2);
        linkedList.addLast(5);
        /************************** Search操作 ************************/
        System.out.println("直接输出："+linkedList);
        System.out.println("getFirst()获得第一个元素："+ linkedList.getFirst());
        System.out.println("removeFirst()删除第一个元素并返回: " + linkedList.removeFirst()); // 移除并返回此列表的第一个元素
        System.out.println("After remove:" + linkedList);
        System.out.println("contains判断是否存在"+linkedList.contains(1));
        System.out.println("该linkedlist的大小"+linkedList.size());
        System.out.println("-----------------");
        linkedList.set(1,3);
        System.out.println("After set(1,3):"+linkedList);
        System.out.println("get(1)要获得指定位置的元素"+linkedList.get(1));
        System.out.println("-------------------");
        linkedList.add(3);
        System.out.println("indexof(3):"+linkedList.indexOf(3));
        //返回第一个3的索引
        System.out.println("lastindexof(3)"+linkedList.lastIndexOf(3));
        /************************** Queue操作 ************************/
        System.out.println("-----------------------------------------");
        System.out.println("获取但不移除列表的头:"+linkedList.peek());
        System.out.println("element():"+linkedList.element());
        linkedList.poll(); // 获取并移除此列表的头
        System.out.println("After poll():" + linkedList);
        linkedList.remove();
        System.out.println("After remove():" + linkedList); // 获取并移除此列表的头
        linkedList.offer(4);
        System.out.println("After offer(4):" + linkedList); // 将指定元素添加到此列表的末尾
        /************************** Deque操作 ************************/
        System.out.println("-----------------------------------------");
        linkedList.offerFirst(2); // 在此列表的开头插入指定的元素
        System.out.println("After offerFirst(2):" + linkedList);
        linkedList.offerLast(5); // 在此列表末尾插入指定的元素
        System.out.println("After offerLast(5):" + linkedList);
        System.out.println("peekFirst(): " + linkedList.peekFirst()); // 获取但不移除此列表的第一个元素
        System.out.println("peekLast(): " + linkedList.peekLast()); // 获取但不移除此列表的第一个元素
        linkedList.pollFirst(); // 获取并移除此列表的第一个元素
        System.out.println("After pollFirst():" + linkedList);
        linkedList.pollLast(); // 获取并移除此列表的最后一个元素
        System.out.println("After pollLast():" + linkedList);
        linkedList.push(2); // 将元素推入此列表所表示的堆栈（插入到列表的头）
        System.out.println("After push(2):" + linkedList);
        linkedList.pop(); // 从此列表所表示的堆栈处弹出一个元素（获取并移除列表第一个元素）
        System.out.println("After pop():" + linkedList);
        linkedList.add(3);
        linkedList.removeFirstOccurrence(3); // 从此列表中移除第一次出现的指定元素（从头部到尾部遍历列表）
        System.out.println("After removeFirstOccurrence(3):" + linkedList);
        linkedList.removeLastOccurrence(3); // 从此列表中移除最后一次出现的指定元素（从头部到尾部遍历列表）
        System.out.println("After removeFirstOccurrence(3):" + linkedList);

        /************************** 遍历操作 ************************/
        System.out.println("-----------------------------------------");
        linkedList.clear();
        System.out.println(linkedList);
        for (int i=0;i<100000;i++){
            linkedList.add(i);
        }
        //迭代器遍历
        long start = System.currentTimeMillis();
        System.out.println(start);
        Iterator<Integer>iterator=linkedList.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        long end=System.currentTimeMillis();
        System.out.println("iterator时间差："+(end-start)+"ms");
        //顺序遍历（随即遍历）
        start=System.currentTimeMillis();
        for (int i=0;i<linkedList.size();i++){
            linkedList.get(i);
        }
        end=System.currentTimeMillis();
        System.out.println("for循环时间差："+(end-start)+"ms");

        // 另一种for循环遍历
        start = System.currentTimeMillis();
        for (Integer i : linkedList)
            ;
        end = System.currentTimeMillis();
        System.out.println("for2：" + (end - start) + " ms");

        //通过pollFirst或者pollLast来遍历LinkedList
        LinkedList<Integer>temp1=new LinkedList<>();
        temp1.addAll(linkedList);
        start=System.currentTimeMillis();
        while (temp1.size()!=0){
            temp1.pollFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("pollFirst()或pollLast()：" + (end - start) + " ms");

        // 通过removeFirst()或removeLast()来遍历LinkedList
        LinkedList<Integer> temp2 = new LinkedList<>();
        temp2.addAll(linkedList);
        start = System.currentTimeMillis();
        while (temp2.size() != 0) {
            temp2.removeFirst();
        }
        end = System.currentTimeMillis();
        System.out.println("removeFirst()或removeLast()：" + (end - start) + " ms");

    }
}
