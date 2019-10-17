package com.ywz.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @autor yangdong
 * @time 2019/10/17 23:52
 */
public class Client {
    public static void main(String[] args) {
        final Producer producer = new Producer();
        /**
         * 动态代理
         * 特点： 字节码随用随创建 随用随加载
         * 作用： 不修改源码的基础上对方法增强和
         * 分类：
         *      基于接口的动态代理
         *      基于子类的动态代理
         *  创建代理对象
         *  Proxy类中的newProxyInstance
         *  被代理类最少实现一个接口 没有则不能使用
         *
         * newProxyInstance方法参数
         * Classloader类加载器 用于加载代理对象字节码 和被代理对象使用相同的类加载器
         * Class[] 字节码数组 让代理对象和被代理对象有相同方法
         * InvocationHandler 用于提供增强代码 让我们写如何代理
         */

        IProducer iProducer = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                producer.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 作用 执行被代理对象的任何接口方法都会经过该方法
                     * @param proxy 代理对象的引用
                     * @param method 当前执行的方法
                     * @param args 当前执行方法所需的参数
                     * @return 和被代理对象方法有相同的返回值
                     * @throws Throwable
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object returnValue = null;
                        Float money = (Float) args[0];
                        if("saleProduct".equals(method.getName())){
                            returnValue = method.invoke(producer,money*0.8f);
                        }
                        return returnValue;
                    }
                });

        producer.saleProduct(10000f);

    }
}
