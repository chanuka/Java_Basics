package com.design_patterns.creational.singleton.serializable;

import java.io.*;

public class SerializableTestMain {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        SerializableLazySingleton l1 = SerializableLazySingleton.getInstance();
        System.out.println(l1.hashCode());

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(l1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SerializableLazySingleton l2 = (SerializableLazySingleton)in.readObject();
        in.close();

        System.out.println(l2.hashCode());

    }
}
