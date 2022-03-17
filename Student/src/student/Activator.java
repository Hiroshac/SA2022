package student;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import org.osgi.framework.ServiceReference;

import computing.Computing;
import university.PubImp;

public class Activator implements BundleActivator {

	ServiceReference serviceReference, computingRef;

	public void start(BundleContext Context) throws Exception {

		System.out.println("Start Consumer");

		computingRef = Context.getServiceReference(Computing.class.getName());
		Computing eligibility = (Computing) Context.getService(computingRef);
		System.out.println(eligibility.publisherervice());
		eligibility.CheckEligibility();

	}
	public void stop(BundleContext Context) throws Exception {
		System.out.println("Good bye");
		Context.ungetService(serviceReference);

	}
}
