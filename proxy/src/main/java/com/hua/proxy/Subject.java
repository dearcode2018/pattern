/**
 * Subject.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.proxy;

/**
 * Subject
 * 描述: 委托对象 和 代理对象 的共同业务接口
 * @author  qye.zheng
 */
public interface Subject
{
	/**
	 * 
	 * 描述: 有参有返回值 
	 * @author  qye.zheng
	 * @param key
	 * @return
	 */
	public String open(final Integer key);
	
	/**
	 * 
	 * 描述:  
	 * @author  qye.zheng
	 * @param name
	 * @return
	 */
	public int status(final String name);
	
	/**
	 * 
	 * 描述: 无参无返回值 
	 * @author  qye.zheng
	 */
	public void close();
}
