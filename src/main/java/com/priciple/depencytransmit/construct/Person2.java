package com.priciple.depencytransmit.construct;

class Person2 {
    private ITV2 itv2;

    Person2(ITV2 itv2) {
        this.itv2 = itv2;
    }

    void watchTV() {
        itv2.play();
    }
}