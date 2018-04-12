/**
  * @filename Action.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.struct.facade;

 /**
 * @type Action
 * @description  动作 (例如 启动、关闭)
 * @author qye.zheng
 */
public interface Action
{
	/**
	 * 
	 * @description 启动
	 * @author qye.zheng
	 */
	public void startup();
	
	/**
	 * 
	 * @description 关闭
	 * @author qye.zheng
	 */
	public void shutdown();
}
