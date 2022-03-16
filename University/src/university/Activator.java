package university;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

    ServiceRegistration serviceRegistration;
    public void start(BundleContext Context) throws Exception {
       
    System.out.println("Publisher start");
    
    PubImp publishservice =new PubImp();
    serviceRegistration=Context.registerService(PubImp.class.getName(),publishservice ,null );
   
    }
   
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Publisher stop");
        serviceRegistration.unregister();
    }

}
