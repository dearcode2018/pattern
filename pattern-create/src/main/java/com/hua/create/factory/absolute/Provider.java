/**
  * @filename Provider.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.factory.absolute;

import com.hua.create.factory.Sender;

 /**
 * @type Provider
 * @description  供应者
 * @author qye.zheng
 */
public interface Provider
{
	/**
	 * 
	 * @description 生产发送器对象
	 * @return
	 * @author qye.zheng
	 */
	public Sender produce();
}
