package com.design_patterns.other.dip.dependencyinjection.injector;

import com.design_patterns.other.dip.dependencyinjection.consumer.Consumer;
import com.design_patterns.other.dip.dependencyinjection.consumer.MyDIApplication;
import com.design_patterns.other.dip.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
