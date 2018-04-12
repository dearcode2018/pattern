/**
 * 描述: 
 * FactoryMethodTest.java
 * 
 * @author qye.zheng
 *  version 1.0
 */
package com.hua.test.create;

// 静态导入
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;

import com.hua.create.factory.Sender;
import com.hua.create.factory.SenderType;
import com.hua.create.factory.method.MultiFactoryMethod;
import com.hua.create.factory.method.NormalFactoryMethod;
import com.hua.create.factory.method.StaticFactoryMethod;
import com.hua.test.BaseTest;


/**
 * 描述: 工厂方法模式 - 测试
 * 
 * @author qye.zheng
 * FactoryMethodTest
 */
public final class FactoryMethodTest extends BaseTest {

	/**
	 * 
	 * 描述: 测试 普通工厂方法模式
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testNormalFactoryMethod() {
		try {
			final NormalFactoryMethod factory = new NormalFactoryMethod();
			// 获取mail发送器对象
			final Sender mailSender = factory.produce(SenderType.MAIL);
			mailSender.send();
			
			// 获取sms发送器对象
			final Sender smsSender = factory.produce(SenderType.SMS);
			smsSender.send();			
		} catch (Exception e) {
			log.error("testNormalFactoryMethod =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试 多个工厂方法模式
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testMultiFactoryMethod() {
		try {
			final MultiFactoryMethod factory = new MultiFactoryMethod();
			// 获取mail发送器对象
			final Sender mailSender = factory.produceMail();
			mailSender.send();
			
			// 获取sms发送器对象
			final Sender smsSender = factory.produceSms();
			smsSender.send();					
			
		} catch (Exception e) {
			log.error("testMultiFactoryMethod =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试 静态工厂方法模式
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testStaticFactoryMethod01() {
		try {
			// 获取mail发送器对象
			final Sender mailSender = StaticFactoryMethod.produce(SenderType.MAIL);
			mailSender.send();
			
			// 获取sms发送器对象
			final Sender smsSender = StaticFactoryMethod.produce(SenderType.SMS);
			smsSender.send();					
			
		} catch (Exception e) {
			log.error("testStaticFactoryMethod =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 测试 静态工厂方法模式
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testStaticFactoryMethod02() {
		try {
			// 获取mail发送器对象
			final Sender mailSender = StaticFactoryMethod.produceMail();
			mailSender.send();
			
			// 获取sms发送器对象
			final Sender smsSender = StaticFactoryMethod.produceSms();
			smsSender.send();					
			
		} catch (Exception e) {
			log.error("testStaticFactoryMethod =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void test() {
		try {
			
			
		} catch (Exception e) {
			log.error("test =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testTemp() {
		try {
			
			
		} catch (Exception e) {
			log.error("testTemp=====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testCommon() {
		try {
			
			
		} catch (Exception e) {
			log.error("testCommon =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testSimple() {
		try {
			
			
		} catch (Exception e) {
			log.error("testSimple =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 
	 * @author qye.zheng
	 * 
	 */
	@Test
	public void testBase() {
		try {
			
			
		} catch (Exception e) {
			log.error("testBase =====> ", e);
		}
	}
	
	/**
	 * 
	 * 描述: 解决ide静态导入消除问题 
	 * @author qye.zheng
	 * 
	 */
	@Ignore("解决ide静态导入消除问题 ")
	private void noUse() {
		String expected = null;
		String actual = null;
		Object[] expecteds = null;
		Object[] actuals = null;
		String message = null;
		
		assertEquals(expected, actual);
		assertEquals(message, expected, actual);
		assertNotEquals(expected, actual);
		assertNotEquals(message, expected, actual);
		
		assertArrayEquals(expecteds, actuals);
		assertArrayEquals(message, expecteds, actuals);
		
		assertFalse(true);
		assertTrue(true);
		assertFalse(message, true);
		assertTrue(message, true);
		
		assertSame(expecteds, actuals);
		assertNotSame(expecteds, actuals);
		assertSame(message, expecteds, actuals);
		assertNotSame(message, expecteds, actuals);
		
		assertNull(actuals);
		assertNotNull(actuals);
		assertNull(message, actuals);
		assertNotNull(message, actuals);
		
		assertThat(null, null);
		assertThat(null, null, null);
		
		fail();
		fail("Not yet implemented");
		
	}

}
