package com.priciple.depencytransmit.set;

class Person3 {
    private ITV3 itv3;


    void setItv3(ITV3 itv3) {
        this.itv3 = itv3;
    }

    void watchTV() {
        itv3.play();
    }
}