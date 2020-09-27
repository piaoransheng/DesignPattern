package com.king.factory.absfactory.order;


import com.king.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author lhc
 * @Date 2020-09-27 10:08
 * 订购披萨
 **/
public class OrderPizza {
    AbsFactory absFactory;


    public OrderPizza(AbsFactory absFactory){
        this.absFactory = absFactory;
        while (true) {
            //披萨类型
            String pizzaType = getType();

            //根据披萨类型创建披萨
            Pizza pizza = absFactory.createPizza(pizzaType);

            if (pizza != null){
                //输出披萨制作过程
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
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