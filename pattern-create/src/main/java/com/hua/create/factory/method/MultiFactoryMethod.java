/**
  * @filename MultiFactoryMethod.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.factory.method;

import com.hua.create.factory.MailSender;
import com.hua.create.factory.Sender;
import com.hua.create.factory.SmsSender;

 /**
 * @type MultiFactoryMethod
 * @description  工厂方法 - 多个工厂方法模式
 * @author qye.zheng
 */
public final class MultiFactoryMethod
{
	/**
	 * 每个实例方法负责生产一个特定的对象.
	 */
	
	/**
	 * 
	 * @description 生产邮件发送器对象
	 * @return
	 * @author qye.zheng
	 */
	public Sender produceMail()
	{
		return new MailSender();
	}
	
	/**
	 * 
	 * @description 生产邮件发送器对象
	 * @return
	 * @author qye.zheng
	 */
	public Sender produceSms()
	{
		return new SmsSender();
	}
}
