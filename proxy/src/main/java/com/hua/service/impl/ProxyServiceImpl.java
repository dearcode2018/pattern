/**
 * ProxyServiceImpl.java
 * @author  qye.zheng
 * 	version 1.0
 */
package com.hua.service.impl;

import com.hua.service.ProxyService;

/**
 * ProxyServiceImpl
 * 描述: 代理 - 服务
 * @author  qye.zheng
 */
public final class ProxyServiceImpl extends CoreServiceImpl implements
		ProxyService
{

	
	/**
	  jdk 动态调用实现步骤
	  1) 定义业务接口(被代理 、 代理的业务逻辑声明)
	  
	  2) 被代理对象的类实现 上面定义的业务接口，单纯是实现，不做任何特殊动作
	  
	  3) 写一个 XxSubjectDynamicProxyHandler 类实现 java.lang.reflect.InvocationHandler 接口
	  覆盖 invoke() 方法，在该声明一个类型为 被代理类 的属性(Object wantedProxy)
	  并且不提供任何存取方法，只在构造方法中进行初始化
	  明确invoke的返回值和各个参数的意义，然后就可以使用该方法了，在该方法中
	  指定的地方植入新的逻辑，这样，整体就解决了动态代理的问题.
	  
	  4) 动态代理 客户端(ProxyClient) : 如何去动态获取代理之后的对象，
	  首先构造一个要被代理的对象，并且将其作为参数创建一个动态代理处理器(XxDynamicProxyHanlder)，
	  接着，使用 java.lang.reflect.Proxy的静态方法 newProxyInstance()， 提供处理器的类加载器，
	  被代理的所实现的接口数组，处理器，这3个对象，就可以将返回的类型强转为业务接口，
	  通过业务接口的回调，来实现代理方法的调用.
	  
	 */
	
	/**
	 
	 Java动态代理主要涉及到两个类: 

    InvocationHandler: 该接口中仅定义了一个Object : invoke(Object proxy, Method method, Object[] args); 参数 proxy 指被代理类的对象，
    method表示被代理的方法，args为method中的参数数组，返回值Object为代理实例的方法调用返回的值。
    这个抽象方法在代理类中动态实现。

    Proxy: 所有动态代理类的父类，提供用于创建 动态代理类 和 实例 的静态方法。
	
	所谓动态代理类是在运行时生成的class字节码所构成的类，在生成它时，你必须提供一组interface给它，
	则动态代理类就宣称它实现了这些interface。
	
	当然，动态代理类就充当一个代理，你不要企图它会帮你干实质性的工作，在生成它的实例时你必须提供一个handler，由它接管实际的工作。
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
}
