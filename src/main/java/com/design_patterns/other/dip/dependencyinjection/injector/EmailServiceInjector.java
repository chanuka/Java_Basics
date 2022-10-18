package com.design_patterns.other.dip.dependencyinjection.injector;


import com.design_patterns.other.dip.dependencyinjection.consumer.Consumer;
import com.design_patterns.other.dip.dependencyinjection.consumer.MyDIApplication;
import com.design_patterns.other.dip.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
