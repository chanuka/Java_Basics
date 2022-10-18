package com.design_patterns.structural.adapter.socket_example;

public interface SocketAdapter {
    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
