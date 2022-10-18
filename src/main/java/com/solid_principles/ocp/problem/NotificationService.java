package com.solid_principles.ocp.problem;

public class NotificationService { // cannot add send sms feature, has to modify this.
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}
