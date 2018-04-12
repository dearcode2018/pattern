/**
  * @filename SmsSendFactory.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.factory.absolute;

import com.hua.create.factory.Sender;
import com.hua.create.factory.SmsSender;

 /**
 * @type SmsSendFactory
 * @description 生产短信发送类型对象的工厂
 * @author qye.zheng
 */
public final class SmsSendFactory implements Provider
{

	/**
	 * @description 
	 * @return
	 * @author qye.zheng
	 */
	@Override
	public Sender produce()
	{
		return new SmsSender();
	}

}
