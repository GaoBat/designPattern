package com.wayne.proxy;

public class CGlibTest {
    public static void main(String[] args) {
        ProxyDynamicCGlib  proxyDynamicCGlib = new ProxyDynamicCGlib();
        ComputerServiceImpl proxyObj1 = (ComputerServiceImpl)
                proxyDynamicCGlib.getProxyObj(ComputerServiceImpl.class);
        proxyObj1.saleComputer(250);
    }
}
