package com.king.factory.factorymethod.order;



import com.king.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author lhc
 * @Date 2020-09-27 11:37
 **/
public abstract class OrderPizza {
    /**
     * 构造器 订购披萨
     */
    public OrderPizza() {
        while (true) {
            //披萨类型
            String pizzaType = getType();

            //创建披萨
            Pizza pizza = createPizza(pizzaType);

            //输出披萨制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    /**
     * 抽象方法创建披萨 让子类单独实现
     *
     * @param pizzaType 披萨类型
     * @return 披萨
     */
    abstract Pizza createPizza(String pizzaType);


    /**
     * 获取客户想要订购披萨的种类
     *
     * @return 披萨类型
     */
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}