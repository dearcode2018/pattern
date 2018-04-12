/**
  * @filename StaticInnerClassSingleton.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.singleton;

 /**
 * @type StaticInnerClassSingleton
 * @description  
 * @author qye.zheng
 */
public final class StaticInnerClassSingleton
{

	/**
	 * @description 构造方法
	 * 私有化 - 防止实例化
	 * @author qye.zheng
	 */
	private StaticInnerClassSingleton()
	{
	}

	/**
	 * 通过一个静态内部类来维护外部类的单例对象
	 * 原理: JVM内部的机制能够保证当一个类被加载时，这个类的
	 * 加载过程是线程互斥的，这样能够保证instance被实例化一次，
	 * 并且会保证把赋值给instance的内存初始化完毕，这样就解决了
	 * ThreadSingletonB 实例化面临的小概率多线程不安全问题.
	 */
	
	/**
	 * 
	 * @type SingletonFactory
	 * @description  静态内部类，维护
	 * @author qye.zheng
	 */
	private static final class SingletonFactory
	{
		private static final StaticInnerClassSingleton 
		instance = new StaticInnerClassSingleton();
	}
	
	/**
	 * 
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	public static final StaticInnerClassSingleton getInstance()
	{
		return SingletonFactory.instance;
	}
	
	/**
	 * 
	 * @description 如果该对象被用于序列化，
	 * 可以保证对象在序列化前后保持一致
	 * @return
	 * @author qye.zheng
	 */
    public Object readResolve()
    {  
        return getInstance();  
    } 
}
