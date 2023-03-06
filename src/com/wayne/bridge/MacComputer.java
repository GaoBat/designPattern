package com.wayne.bridge;

public class MacComputer extends AbComputerBrank{
    public MacComputer(IcpuAvaliable icpuAvaliable) {
        super(icpuAvaliable);
    }

    @Override
    public void checkComputer() {
        System.out.println("苹果笔记本"+super.icpuAvaliable.cpuAvaliable());
    }
}
