package com.design_patterns.other.dip.dependencyinjection.injector;


import com.design_patterns.other.dip.dependencyinjection.consumer.Consumer;

public interface MessageServiceInjector {

	public Consumer getConsumer();
}
