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
		serviceReference = Context.getServiceReference(PubImp.class.getName());
		PubImp pub = (PubImp) Context.getService(serviceReference);

		System.out.println(pub.publisherervice());

		while (true) {

			int crse = pub.CheckEligibility(), crs;
			if ((crse < 1) || (crse > 4)) {
				System.out.println("You entered invalid course code. Please re-enter");
				if (crse == 1) {
					System.out.println("Welcome to Enginnering");
					
					break;
				} else if (crse == 2) {

					computingRef = Context.getServiceReference(Computing.class.getName());
					Computing computing = (Computing) Context.getService(computingRef);
					computing.selectDegree();

					break;
				} else if (crse == 3) {
					System.out.println("Welcome to Buisness");

					break;
				} else {
					System.out.println("Welcome to Medicine");
					break;
				}
			}
		}

	}

	public void stop(BundleContext Context) throws Exception {
		System.out.println("Good bye");
		Context.ungetService(serviceReference);

	}
}
