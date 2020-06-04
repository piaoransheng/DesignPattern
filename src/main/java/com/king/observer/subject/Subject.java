package com.king.observer.subject;

import com.king.observer.observer.Observer;

/**
 * 气象站接口(一方)
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
