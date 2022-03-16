package computing;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;




public class Activator implements BundleActivator {
	  ServiceRegistration computerRegistration;

	public void start(BundleContext Context) throws Exception {
		 System.out.println("Computing start");
		    
		    Computing computing =new Computing();
		    computerRegistration=Context.registerService(Computing.class.getName(),computing,null);
		   
	}

	public void stop(BundleContext bundleContext) throws Exception {
		 System.out.println("Computing stop");
	        computerRegistration.unregister();
	}

}
