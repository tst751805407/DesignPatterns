package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test4 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        // 键不能重复，值可以重复
        map.put("san", "张三");
        map.put("si", "李四");
        map.put("wu", "王五");
        map.put("wang", "老王");
        map.put("wang", "老王2");// 老王被覆盖
        map.put("lao", "老王");
        Iterator it=map.keySet().iterator();
        while (it.hasNext()){
            

        }

    }

}
