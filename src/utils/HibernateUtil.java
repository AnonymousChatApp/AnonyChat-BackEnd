package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
 
public class HibernateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();
	private static ServiceRegistry serviceRegistry;
 
    private static SessionFactory buildSessionFactory() {
    	try {

			Configuration configuration = new Configuration();
			configuration.configure();
			serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
					configuration.getProperties()).getBootstrapServiceRegistry();
			return configuration.buildSessionFactory(serviceRegistry);

		} catch (Throwable th) {

			System.err.println("Enitial SessionFactory creation failed" + th);

			throw new ExceptionInInitializerError(th);

		}

    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    

 
    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
 
}