package com.king.factory.simplefactory.order;

import com.king.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author lhc
 * @Date 2020-09-27 10:08
 * 订购披萨
 **/
public class OrderPizza {

    /**
     * 构造器 订购披萨
     */
    public OrderPizza() {
        while (true) {
            //披萨类型
            String pizzaType = getType();

            //根据披萨类型创建披萨
            Pizza pizza = SimpleFactory.createPizza(pizzaType);

            //输出披萨制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }

    /**
     * 获取客户想要订购披萨的种类
     *
     * @return 披萨类型
     */
    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String type = bufferedReader.readLine();
            return type;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}