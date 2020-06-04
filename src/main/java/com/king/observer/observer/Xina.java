package com.king.observer.observer;

/**
 *
 */
public class Xina implements Observer {
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
        System.out.println("新浪温度：" +  temperature);
        System.out.println("新浪气压：" +  pressure);
        System.out.println("新浪湿度：" +  humidity);
    }


}
