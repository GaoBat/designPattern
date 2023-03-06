package com.wayne.bridge;

public class Test {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // intel
        IcpuAvaliable iAvaliable = new IntelCpuImpl();
        AbComputerBrank abComputerBrank = new MacComputer(iAvaliable);
        abComputerBrank.checkComputer();

        iAvaliable = new AmdCpuImpl();
        abComputerBrank = new MacComputer(iAvaliable);
        abComputerBrank.checkComputer();

    }
}
