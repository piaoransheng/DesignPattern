package com.king.flyweight;

public class Client {
    public static void main(String[] args) {
        //创建工厂类
        WebSiteFactory factory = new WebSiteFactory();

        User user = new User("tom");
        User user2 = new User("jack");

        //客户要一个新闻类型的网站
        WebSite webSite1 = factory.createWebSite("新闻");

        webSite1.use(user);

        //客户要一个博客类型的网站
        WebSite webSite2 = factory.createWebSite("博客");
        webSite2.use(user);


        //又一个客户要一个博客类型的网站
        WebSite webSite3 = factory.createWebSite("博客");
        webSite3.use(user2);

        System.out.println(factory.getWebSiteCount());

    }
}
