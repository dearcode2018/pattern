/**
 * @filename package-info.java
 * @description  
 * @version 1.0
 * @author qye.zheng
 */
/**
 * @type package-info
 * @description  设计模式-结构型 ->观察者模式
 * @author qye.zheng
 */
package com.hua.behavior.observer;

/**
 * 观察者模式
 *
 *1) 观察者模式类似于邮件订阅和RSS订阅。在浏览一些博客或wiki(百科全书)时，
 *经常会看到RSS图标，意思就是，当你订阅了该文章，如果后续有更新，会及时
 *通知你。
 *简单而言，当一个对象变化时，其他依赖该对象的对象都会收到通知，并且伴随着
 *变化. 对象之间关系式一对多关系.
 *
 *2) 一个主题业务(Subject)接口，一个抽象实现AbstractSubject，负责维护观察者
 *对象(新增、删除、通知部分/全部观察者-就是向观察者推送消息等操作)
 *某个实现类继承AbstractSubject，实现本身的具体的业务.
 *
 *一个观察者接口，定义主题业务发生变更后的update操作。
 *多个观察者实现类实现观察者接口.
 *
 *主题对象维护观察者的新增、删除、通知以及主题本身应该完成的业务逻辑.
 *观察者: 声明主题对象发生变化后，需要完成什么样的业务逻辑.
 *
 *3)
 *
 *
 */

