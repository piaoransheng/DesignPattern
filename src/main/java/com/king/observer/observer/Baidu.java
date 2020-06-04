package com.king.observer.observer;

/**
 *
 */
public class Baidu implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    //更新
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display(){
        System.out.println("百度温度：" +  temperature);
        System.out.println("百度气压：" +  pressure);
        System.out.println("百度湿度：" +  humidity);
    }


}
