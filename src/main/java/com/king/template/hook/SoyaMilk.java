package com.king.template.hook;


/**
 * 抽象类：豆浆类
 * 1.选材料
 * 2.添加配料
 * 3.浸泡
 * 4.豆浆机打碎
 */
public abstract class SoyaMilk {
    //模板方法可以做成final，不让子类去覆盖
    final void make(){
        select();
        if (hook()){
            add();
        }
        soak();
        beat();
    }

    //1.选材料
    void select(){
        System.out.println("第一步，选新鲜的黄豆");
    }

    //2.添加配料
    public abstract void add();

    //3.浸泡
    void soak(){
        System.out.println("第三步，黄豆和配料开始浸泡");
    }

    //4.豆浆机打碎
    void beat(){
        System.out.println("第四步，豆浆机打碎");
    }

    public boolean hook(){
        return true;
    }

}
