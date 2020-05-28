package com.king.flyweight;

/**
 * 具体网站
 */
public class ConcreteWebSite extends WebSite {
    private String type = "";  //网址发布的类型

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网址的发布形式为："  + type + "，" + user.getName() + "正在使用中");
    }
}
