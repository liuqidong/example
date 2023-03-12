package com.lagou.unit4;



/**
 * jstack [options]  <pid>
 * <p>
 * option参数解释：
 * - -F 当使用jstack <pid>无响应时，强制输出线程堆栈。
 * - -m 同时输出java堆栈和c/c++堆栈信息(混合模式)
 * - -l 除了输出堆栈信息外,还显示关于锁的附加信息
 */
public class Demo5_jstack02 {
    public static void main(String[] args) {
        while (true){}
    }
}
