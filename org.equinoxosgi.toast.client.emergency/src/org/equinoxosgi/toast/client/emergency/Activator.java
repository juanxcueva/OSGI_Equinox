package org.equinoxosgi.toast.client.emergency;

import org.equinoxosgi.toast.dev.airbag.Airbag;
import org.equinoxosgi.toast.dev.gps.Gps;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	private Airbag airbag;
	private Gps gps;
	private EmergencyMonitor monitor;

	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Launching");
		gps = new Gps();
		airbag = new Airbag();
		monitor = new EmergencyMonitor();
		monitor.setGps(gps);
		monitor.setAirbag(airbag);
		monitor.startup();
		airbag.deploy();

	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		monitor.shutdown();
		System.out.println("Terminating");

	}
}