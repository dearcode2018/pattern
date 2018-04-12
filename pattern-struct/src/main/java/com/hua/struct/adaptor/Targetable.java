/**
  * @filename Targetable.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.adaptor;

 /**
 * @type Targetable
 * @description  
 * @author qye.zheng
 */
public interface Targetable
{

	/**
	 * 
	 * @description 对应Source类的方法
	 * @author qye.zheng
	 */
	public void source();
	
	/**
	 * 
	 * @description Source类没有的方法，需要适配
	 * @author qye.zheng
	 */
	public void target();
}
