package org.equinoxosgi.toast.internal.dev.gps.fake.bundle;

import org.equinoxosgi.toast.dev.gps.IGps;
import org.equinoxosgi.toast.internal.dev.gps.fake.FakeGps;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	private ServiceRegistration registration;
	public void start(BundleContext context){
		FakeGps gps = new FakeGps();
		 registration = context.registerService(
		 IGps.class.getName(), gps, null);

	}

	public void stop(BundleContext context) {
		// TODO Auto-generated method stub
		registration.unregister();
	}

}
