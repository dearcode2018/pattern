/**
  * @filename ThreadSingletonB.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.singleton;

 /**
 * @type ThreadSingletonB
 * @description  
 * @author qye.zheng
 */
public class ThreadSingletonB
{

	/* 持有私有的静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
	private static ThreadSingletonB instance = null;
	
	/**
	 * @description 构造方法
	 * 私有化 - 防止实例化
	 * @author qye.zheng
	 */
	private ThreadSingletonB()
	{
	}

	/**
	 * 
	 * @description 获取单例对象
	 * 考虑多线程安全问题
	 * 在实例化代码块加上声明 synchronized
	 * @return
	 * @author qye.zheng
	 */
	public static final ThreadSingletonB getInstance()
	{
		/**
		 * 存在问题
		 * JVM 对 instance = new ThreadSingletonB();语句是分两步执行的，
		 * 依次是赋值和创建对象，JVM并不保证这2个操作的顺序，也可能先给
		 * 新的实例分配内存空间，然后直接赋值给instance变量，最后再去初始化
		 * ThreadSingletonB实例，这样就会导致某个线程拿到一个没有初始化的实例，
		 * 这样机会发生异常了.
		 */
		/*
		 * a>A、B线程同时进入了第一个if判断
		 * 
			b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
			
			c>由于JVM内部的优化机制，JVM先画出了一些分配给Singleton实例的空白内存，
			并赋值给instance成员（注意此时JVM没有开始初始化这个实例），
			然后A离开了synchronized块。
			
			d>B进入synchronized块，由于instance此时不是null，
			因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
			
			e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。
			所以程序还是有可能发生错误，其实程序在运行过程是很复杂的，
			
			从这点我们就可以看出，尤其是在写多线程环境下的程序更有难度，有挑战性
		 */
		if (null == instance)
		{
			/*
			 * 为空的时候加上同步限制
			 * 只会在第一次创建对象的时候加锁
			 */
			synchronized(instance)
			{
				/*
				 * 拿到锁之后进来，还要判断一次
				 * 原因: 若线程A、B都执行到同步块之前，如果线程A先拿到锁，
				 * 进去之后，instance就会被实例化，然后线程A释放锁，线程B
				 * 拿到锁之后，进入同步块，如果此时，没有做是否为null判断，
				 * 则将导致instance被再次实例化.
				 */
				if (null == instance)
				{
					instance = new ThreadSingletonB();
				}
			}
		}
		
		return instance;
	}

}
