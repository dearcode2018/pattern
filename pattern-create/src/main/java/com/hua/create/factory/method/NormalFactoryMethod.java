/**
  * @filename NormalFactoryMethod.java
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
 * @type NormalFactoryMethod
 * @description  工厂方法 - 普通工厂模式
 * @author qye.zheng
 */
public final class NormalFactoryMethod
{
	/**
	 * 通过枚举来识别具体的返回对象类型
	 */
	
	/**
	 * 
	 * @description 
	 * @param type
	 * @return
	 * @author qye.zheng
	 */
	public Sender produce(final SenderType type)
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
