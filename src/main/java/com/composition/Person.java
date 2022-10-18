package com.composition;

public class Person {
    //composition has-a relationship
    private Job job;
    private String name;

    public Person(String name,long salary){
        this.name=name;
        this.job=new Job();
        job.setSalary(salary);
    }
    public String getSalary() {
        return job.getSalary();
    }

    public String getName() {
        return name;
    }
}
