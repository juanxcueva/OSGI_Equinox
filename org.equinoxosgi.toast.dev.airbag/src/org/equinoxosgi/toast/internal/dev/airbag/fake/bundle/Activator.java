package org.equinoxosgi.toast.internal.dev.airbag.fake.bundle;

import org.equinoxosgi.toast.dev.airbag.IAirbag;
import org.equinoxosgi.toast.internal.dev.airbag.fake.FakeAirbag;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	private ServiceRegistration registration;
	private FakeAirbag airbag; 

	public void start(BundleContext context){
		airbag = new FakeAirbag();
		 airbag.startup();
		 registration = context.registerService(
		 IAirbag.class.getName(), airbag, null);

	}

	public void stop(BundleContext context) {
		registration.unregister();
		 airbag.shutdown();
	}

}
