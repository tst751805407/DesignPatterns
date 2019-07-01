package LeetCode;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class test3 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        // 键不能重复，值可以重复
        map.put("san", "张三");
        map.put("si", "李四");
        map.put("wu", "王五");
        map.put("wang", "老王");
        map.put("wang", "老王2");// 老王被覆盖
        map.put("lao", "老王");
        System.out.println("-------直接输出hashmap:-------");
        System.out.println(map);
        /*
        遍历hashmap
         */
        System.out.println("-----foreach获取Map中所有的键--------");
        Set<String> keys=map.keySet();
        for (String key:keys){
            System.out.print(key+" ");
        }
        System.out.println();
        // 2.获取Map中所有值
        System.out.println("-------foreach获取Map中所有的值:------");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.print(value+"  ");
        }

        System.out.println("--------得到key的同时也得到值----------");
        Set<String> keys2=map.keySet();
        for (String key:keys2){
            System.out.print(key+":"+map.get(key)+"  ");
        }

        Set ent=map.entrySet();

        Iterator it=map.keySet().iterator();
        while (it.hasNext()){
            String key=(String) it.next();
        }

        System.out.println("----------map的其他用法-------------");
        System.out.println("after map.size()："+map.size());
        System.out.println("after map.isEmpty()："+map.isEmpty());
        System.out.println(map.remove("san"));
        System.out.println("after map.remove()："+map);
        System.out.println("after map.get(si)："+map.get("si"));
        System.out.println("after map.containsKey(si)："+map.containsKey("si"));
        System.out.println("after containsValue(李四)："+map.containsValue("李四"));
        System.out.println(map.replace("si", "李四2"));
        System.out.println("after map.replace(si, 李四2):"+map);


    }
}
