package com.wayne.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//代理工具类
public class ProxyDynamicCGlib {
    MyLogUtil myLogUtil=new MyLogUtil();
    //获取代理对象
    public Object getProxyObj(Class<?> clazz){
        //定义一个字节码增强器
        Enhancer enhancer = new Enhancer();
        //设置增强对象,目标对象
        enhancer.setSuperclass(clazz);
        //给增强器设置回调函数
        //Interceptor是拦截器的意思，拦截目标对象的方法
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //执行目标对象的方法
                Object invokeSuper = methodProxy.invokeSuper(o, objects);
                //增强处理
                myLogUtil.log(method.getName());
                return invokeSuper;
            }
        });
        //返回代理对象
        return enhancer.create();
    }
}
