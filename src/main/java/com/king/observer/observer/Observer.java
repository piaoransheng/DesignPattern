package com.king.observer.observer;

/**
 * 观察者接口(多方)
 */
public interface Observer {
    public void update(float temperature,float pressure,float humidity);
}
