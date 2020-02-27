package cartproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	//ServiceReference serviceReference;
	ServiceRegistration publishServiceRegistrion;

	public void start(BundleContext context) throws Exception {
//		serviceReference = context.getServiceReference(CartServicePublisher.class.getName());
//		CartServicePublisher cartServicePublisher = (CartServicePublisher)context.getService(serviceReference);
//		cartServicePublisher.cartMenue();
		CartServicePublisher cartServicePublisher = new CartServiceImpl();
		publishServiceRegistrion = context.registerService(CartServicePublisher.class.getName(), cartServicePublisher, null);
		System.out.println("Start Cart Service");
	}

	public void stop(BundleContext context) throws Exception {
		publishServiceRegistrion.unregister();
		System.out.println("Stop Cart Service");
	}

}
