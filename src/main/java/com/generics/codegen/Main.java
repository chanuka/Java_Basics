package com.generics.codegen;

public class Main {
    public static void main(String[] args) {
        BeanBox bb = new BeanBox(RuleType.H);

        bb.mapSchemes.put("test",new BBSet<Long>());


    }
}
