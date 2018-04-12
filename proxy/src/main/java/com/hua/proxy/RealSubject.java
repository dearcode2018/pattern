/**
 * RealSubject.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.proxy;

/**
 * RealSubject
 * 描述: 委托类 (被代理对象的类)
 * @author  qye.zheng
 */
public final class RealSubject implements Subject
{

	/**
	 * 描述: 
	 * @author  qye.zheng
	 * @param key
	 * @return
	 */
	@Override
	public String open(final Integer key)
	{
		System.out.println("RealSubject.open()");
		final String result = "key: " + key;
		
		return result;
	}

	/**
	 * 描述: 
	 * @author  qye.zheng
	 * @param name
	 * @return
	 */
	@Override
	public int status(final String name)
	{
		System.out.println("RealSubject.status()");
		final int status = name.hashCode();
		
		return status;
	}

	/**
	 * 描述: 
	 * @author  qye.zheng
	 */
	@Override
	public void close()
	{
		System.out.println("RealSubject.close()");
	}

}
