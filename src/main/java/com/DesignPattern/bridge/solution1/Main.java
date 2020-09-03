package com.DesignPattern.bridge.solution1;

/**
 * 传统解决方案在这里就不具体实现了， 只是解释一下
 *
 * 需求：手机分不同的品牌和形态， 比如滑盖手机， 翻盖手机， 触屏手机， 每种分类又分不同的品牌
 *      现在要位这些手机实现打电话的方法
 *
 * 实现方式： 最高层Phone抽象类，定义一个call方法
 *          中间层SlidePhone,TouchPhone等抽象类继承Phone，
 *          最下层比如说AppleTouchPhone,AppleSlidePhone继承中间层，并实现call方法
 *
 * 优点：简单值观
 * 缺点：
 *      1. 拓展性查（类爆炸）。
 *          如果我们想要添加一种新的手机，那么需要为所有品牌都写一个相应的类；
 *          如果添加一个新的方法。那么所有的手机类都需要相应实现
 */
public class Main {
}
