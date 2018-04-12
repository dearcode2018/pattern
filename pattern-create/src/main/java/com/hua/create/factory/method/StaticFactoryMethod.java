/**
  * @filename StaticFactoryMethod.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.factory.method;

import com.hua.create.factory.MailSender;
import com.hua.create.factory.Sender;
import com.hua.create.factory.SenderType;
import com.hua.create.factory.SmsSender;

 /**
 * @type StaticFactoryMethod
 * @description  工厂方法 - 静态工厂方法模式
 * @author qye.zheng
 */
public class StaticFactoryMethod
{
	/**
	 * 每个静态方法负责生产一个特定的对象.
	 */
	
	/**
	 * 
	 * @description 生产邮件发送器对象
	 * @return
	 * @author qye.zheng
	 */
	public static Sender produceMail()
	{
		return new MailSender();
	}
	
	/**
	 * 
	 * @description 生产邮件发送器对象
	 * @return
	 * @author qye.zheng
	 */
	public static Sender produceSms()
	{
		return new SmsSender();
	}
	
	/**
	 * 也可以通过枚举来识别具体的返回对象类型
	 */
	
	/**
	 * 
	 * @description 
	 * @param type
	 * @return
	 * @author qye.zheng
	 */
	public static Sender produce(final SenderType type)
	{
		Sender result = null;
		if (SenderType.MAIL == type)
		{
			// mail
			result = new MailSender();
		} else if (SenderType.SMS == type)
		{
			// sms
			result = new SmsSender();
		} 
		
		return result;
	}
}
