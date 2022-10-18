package com.design_patterns.structural.adapter.socket_example.class_pattern;

import com.design_patterns.structural.adapter.socket_example.Socket;
import com.design_patterns.structural.adapter.socket_example.SocketAdapter;
import com.design_patterns.structural.adapter.socket_example.Volt;

//Using inheritance for adapter pattern
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
