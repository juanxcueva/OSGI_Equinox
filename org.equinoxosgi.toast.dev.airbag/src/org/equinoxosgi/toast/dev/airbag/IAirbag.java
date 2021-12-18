package org.equinoxosgi.toast.dev.airbag;

public interface IAirbag {

	void addListener(IAirbagListener listener);

	void removeListener(IAirbagListener listener);

}