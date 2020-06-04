package com.king.observer;

import com.king.observer.observer.Baidu;
import com.king.observer.observer.Xina;
import com.king.observer.subject.WeatherCenter;

public class Client {
    public static void main(String[] args) {

        //1.创建气象中心
        WeatherCenter weatherCenter = new WeatherCenter();

        //2.创建观察者并注册
        Xina xina = new Xina();
        weatherCenter.registerObserver(xina);

        Baidu baidu =  new Baidu();
        weatherCenter.registerObserver(baidu);

        //3.气象中心更新天气
        weatherCenter.setDate(37,100,50);
    }
}
