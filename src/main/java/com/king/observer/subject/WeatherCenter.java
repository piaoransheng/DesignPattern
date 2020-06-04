package com.king.observer.subject;

import com.king.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象中心
 */
public class WeatherCenter implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observerList;

    public WeatherCenter() {
        observerList = new ArrayList<Observer>();
    }

    //气象站更新天气数据 并通知访问者也更新
    public void setDate(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObserver();  //通知访问者
    }


    //注册观察者
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    //移除观察者
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    //通知观察者变更天气信息
    @Override
    public void notifyObserver() {
        for(int i=0;i<observerList.size();i++){
            observerList.get(i).update(this.temperature,this.pressure,this.humidity);
        }
    }
}
