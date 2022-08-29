package com.cmict.design.factory.impl;


import java.util.function.Consumer;
import java.util.function.Function;

public enum StoreFactory {

    CARD(CardGrantImpl::sendCommodity2)


    private final Consumer consumer;

    StoreFactory(Consumer consumer) {
        this.consumer = consumer;
    }
    public Consumer desensitize() {
        return consumer;
    }
}
