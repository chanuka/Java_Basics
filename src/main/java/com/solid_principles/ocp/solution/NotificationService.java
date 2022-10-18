package com.solid_principles.ocp.solution;

public interface NotificationService {
    public void sendOTP(String medium);
    public void sendTransactionNotification(String medium);
}
