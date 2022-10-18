package com.design_patterns.structural.adapter.socket_example;

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
