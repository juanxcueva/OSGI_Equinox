package org.equinoxosgi.toast.internal.dev.gps.fake;

import org.equinoxosgi.toast.dev.gps.IGps;

public class FakeGps implements IGps {
	public int getHeading() {
		return 90; // 90 degrees (east)
	}

	public int getLatitude() {
		return 3776999; // 37.76999 N
	}

	public int getLongitude() {
		return -12244694; // 122.44694 W
	}

	public int getSpeed() {
		return 50; // 50 kph
	}
}