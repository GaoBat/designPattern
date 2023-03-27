package com.wayne.bridge;
//扩充抽象类
public abstract class AbComputerBrank {
    public IcpuAvaliable icpuAvaliable;

    public AbComputerBrank(IcpuAvaliable icpuAvaliable) {
        this.icpuAvaliable = icpuAvaliable;
    }

    //品牌维度
    public abstract void checkComputer();
}
