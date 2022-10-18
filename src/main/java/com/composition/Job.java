package com.composition;

import java.text.NumberFormat;
import java.util.Locale;

public class Job {
    private String role;
    private String salary;
    private int id;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        this.salary = n.format(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
