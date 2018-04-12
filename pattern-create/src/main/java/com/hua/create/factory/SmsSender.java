/**
  * @filename SmsSender.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.factory;

 /**
 * @type SmsSender
 * @description  
 * @author qye.zheng
 */
public final class SmsSender implements Sender
{

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void send()
	{
		System.out.println("SmsSender.send()");
	}

}
