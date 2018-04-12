/**
  * @filename Builder.java
  * @description  
  * @version 1.0
  * @author qye.zheng
 */
package com.hua.create.builder;

import java.util.ArrayList;
import java.util.List;

import com.hua.create.factory.MailSender;
import com.hua.create.factory.Sender;
import com.hua.create.factory.SmsSender;

 /**
 * @type Builder
 * @description  建造者
 * @author qye.zheng
 */
public final class Builder
{

	private List<Sender> senders = new ArrayList<Sender>();
	
	/**
	 * @description 构造方法
	 * @author qye.zheng
	 */
	public Builder()
	{
	}

	/**
	 * 
	 * @description 
	 * @param count
	 * @author qye.zheng
	 */
	public void produceMailSender(final int count)
	{
		for (int i = 0; i < count; i++)
		{
			senders.add(new MailSender());
		}
	}

	/**
	 * 
	 * @description 
	 * @param count
	 * @author qye.zheng
	 */
	public void produceSmsSender(final int count)
	{
		for (int i = 0; i < count; i++)
		{
			senders.add(new SmsSender());
		}
	}
	
	/**
	 * @return the senders
	 */
	public final List<Sender> getSenders()
	{
		return senders;
	}

	
}
