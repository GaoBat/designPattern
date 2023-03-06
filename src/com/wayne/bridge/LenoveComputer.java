package com.wayne.bridge;

public class LenoveComputer extends AbComputerBrank{
    public LenoveComputer(IcpuAvaliable icpuAvaliable) {
        super(icpuAvaliable);
    }

    @Override
    public void checkComputer() {
        System.out.println("联想笔记本"+super.icpuAvaliable.cpuAvaliable());
    }
}
