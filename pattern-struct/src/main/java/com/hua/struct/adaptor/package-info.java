/**
 * @filename package-info.java
 * @description  
 * @version 1.0
 * @author qye.zheng
 */
/**
 * @type package-info
 * @description  设计模式-结构型 ->适配器模式
 * @author qye.zheng
 */
package com.hua.struct.adaptor;

/**
 * 适配器模式
 * 适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是
 * 消除由于接口不匹配所造成的类的兼容性问题.
 * 
 *1) 类的适配器模式
 * 继承要扩展的原始类(Source)，并实现自定义的目标接口(Targetable)的适配器类(ClassAdaptor)，目标接口的有些方法在
 * 原始类中可以体现出来，
 * 
 *2) 对象的适配器模式
 *对象适配器模式是其他结构型模式的起源.
 * 适配器类(ObjectAdaptor)实现自定义的目标接口(Targetable)，并持有原始类(Source)
 * 的对象
 *3) 接口的适配器模式
 *通过抽象包装类(AbstractSource)空实现一个原始接口(Sourceable)的所有方法
 *然后SourceSub1 SourceSub2等继承AbstractSource抽象类，有选择地覆盖目标接口的
 *方法即可，不用全部覆写目标接口的方法.
 *
 *总结: 若Source是final类，则可以通过对象的适配器方式来适配Source的功能，以满足
 *目标接口.
 *
 */

