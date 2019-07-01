package LeetCode;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class MultiThread {
    public static void main(String[] args) {
        ThreadMXBean threadMXBean= ManagementFactory.getThreadMXBean();
        //获取java线程管理MXBean
        ThreadInfo[] threadInfos=threadMXBean.dumpAllThreads(false,false);
        for (ThreadInfo threadInfo:threadInfos){
            System.out.println("["+threadInfo.getThreadId()+"]"+threadInfo.getThreadName());
        }
    }
}
