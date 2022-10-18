package com.design_patterns.structural.adapter.socket_example;

import com.design_patterns.structural.adapter.socket_example.class_pattern.SocketClassAdapterImpl;
import com.design_patterns.structural.adapter.socket_example.object_pattern.SocketObjectAdapterImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Example");

        testClassAdapter();
        testObjectAdapter();
    }

        private static void testObjectAdapter () {
            SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
            Volt v3 = getVolt(sockAdapter, 3);
            Volt v12 = getVolt(sockAdapter, 12);
            Volt v120 = getVolt(sockAdapter, 120);
            System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
            System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
            System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
        }

        private static void testClassAdapter () {
            SocketAdapter sockAdapter = new SocketClassAdapterImpl();
            Volt v3 = getVolt(sockAdapter, 3);
            Volt v12 = getVolt(sockAdapter, 12);
            Volt v120 = getVolt(sockAdapter, 120);
            System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
            System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
            System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
        }

        private static Volt getVolt (SocketAdapter sockAdapter,int i){
            switch (i) {
                case 3:
                    return sockAdapter.get3Volt();
                case 12:
                    return sockAdapter.get12Volt();
                case 120:
                    return sockAdapter.get120Volt();
                default:
                    return sockAdapter.get120Volt();
            }
        }
}
