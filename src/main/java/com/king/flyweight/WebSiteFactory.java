package com.king.flyweight;

import java.util.HashMap;

public class WebSiteFactory {

    //集合，充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    //根据网站的类型，返回一个网站；如果没有，创建并返回
    public WebSite createWebSite(String type){
        if (!pool.containsKey(type)){
            //如果没有，创建并放入池中
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    //获取网站分类的总数
    public int getWebSiteCount(){
        return pool.size();
    }
}
