/**
  * @filename MailSendFactory.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.factory.absolute;

import com.hua.create.factory.MailSender;
import com.hua.create.factory.Sender;

 /**
 * @type MailSendFactory
 * @description  生产邮件发送类型对象的工厂
 * @author qye.zheng
 */
public final class MailSendFactory implements Provider
{

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public Sender produce()
	{
		return new MailSender();
	}

}
