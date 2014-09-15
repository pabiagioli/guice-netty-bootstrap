package com.pampanet.server.nio.sample;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Bootstrap {

	public static void main(String[] args) throws Exception {
		Injector injector = Guice.createInjector(new BootstrapNettyModule());
		final BootstrapNettyServer server = injector.getInstance(BootstrapNettyServer.class);
		server.run();
	}
	
}
