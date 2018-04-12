/**
  * @filename MailSender.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.factory;

 /**
 * @type MailSender
 * @description  
 * @author qye.zheng
 */
public final class MailSender implements Sender
{

	/**
	 * @description 
	 * @author qye.zheng
	 */
	@Override
	public void send()
	{
		System.out.println("MailSender.send()");
	}

}
