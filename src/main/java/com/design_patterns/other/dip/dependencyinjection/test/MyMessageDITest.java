package com.design_patterns.other.dip.dependencyinjection.test;

import com.design_patterns.other.dip.dependencyinjection.consumer.Consumer;
import com.design_patterns.other.dip.dependencyinjection.injector.EmailServiceInjector;
import com.design_patterns.other.dip.dependencyinjection.injector.MessageServiceInjector;
import com.design_patterns.other.dip.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Pankaj";
		String email = "pankaj@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
