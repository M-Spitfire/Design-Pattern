package com.DesignPattern.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 网站工厂类
 *
 * 根据发布平台的不同, 返回不同的网站(内容都相同, 定义在Website抽象类里)
 */
public class WebsitePool {
    //网站池
    private static Map<String, ConcreteWebsite> websiteMap = new HashMap<>();

    public static Website getWebsite(String type){
        if(!websiteMap.containsKey(type)){
            websiteMap.put(type, new ConcreteWebsite(type));
        }
        return websiteMap.get(type);
    }

    public static int getWebsiteNum(){
        return websiteMap.size();
    }
}
