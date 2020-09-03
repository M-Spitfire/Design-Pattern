package com.DesignPattern.bridge.bridgeSolution;

import com.DesignPattern.bridge.bridgeSolution.brand.XiaoMi;
import com.DesignPattern.bridge.bridgeSolution.phone.SlidePhone;

/**
 * 桥接模式
 *
 * 将多层继承拆分成抽象和实现，
 * 比如手机的这个例子，我们将品牌单独拆分出来一个抽象类（接口）， 然后继承这个抽象类（实现接口）创建出不同的品牌
 * 这样手机只需要进行一次分类即可，品牌的信息通过成员变量的方式组合进来即可
 *
 * 对于那些不希望使用继承或因为多层次继承导致系统类的个数急剧增加的系统，桥接模式尤为适用.
 * 1.  -JDBC 驱动程序
 *
 * 2.  -银行转账系统
 * > 转账分类: 网上转账，柜台转账，AMT 转账
 * > 转账用户类型：普通用户，银卡用户，金卡用户..
 *
 * 3.  -消息管理
 * > 消息类型：即时消息，延时消息
 * > 消息分类：手机短信，邮件消息，QQ 消息\...
 */
public class Main {
    public static void main(String[] args) {
        SlidePhone slidePhone = new SlidePhone(new XiaoMi());
        slidePhone.open();
        slidePhone.call();
        slidePhone.close();
    }
}
