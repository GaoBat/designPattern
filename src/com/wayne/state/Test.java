package com.wayne.state;
//https://www.cnblogs.com/zyrblog/p/9250285.html
//state模式的定义:不同的状态,不同的行为,或者说每个状态有着相应的行为
//state模式在实际使用中比较多,适合'状态的切换',因为我们经常会使用if else if else
//进行状态切换,如果针对状态的这样判断反复出现,我们就要联想到是否可以采取state模式了
public class Test {
    public static void main(String[] args) {
        SafeFrame f = new SafeFrame("状态模式");
        while (true) {
            for (int hour = 1; hour <= 24; hour++) {
                f.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
