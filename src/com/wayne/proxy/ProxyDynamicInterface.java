package com.wayne.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
//基于接口的jdk动态代理
//必须实现接口invocationHandler(调用处理器)
public class ProxyDynamicInterface<T> implements InvocationHandler {
    //声明一个目标对象
    private T obj;
    private MyLogUtil myLogUtil=new MyLogUtil();

    //获取代理对象
    public T getProxyObj(T target) {
        obj = target;
        T proxyInstance = (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
        return proxyInstance;
    }

    /**
     * 目标对象的方法被调用的时候，自动执行invoke方法中的内容
     * param:[proxy, method, args]
     * return:java.lang.Object
     **/
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("目标对象方法开始执行");
        //方法执行之前增强处理
        Object o = method.invoke(obj, args);
        //方法执行后增强处理
        myLogUtil.log(method.getName());
        return o;
    }
}
