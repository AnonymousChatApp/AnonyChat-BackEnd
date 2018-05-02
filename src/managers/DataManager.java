package managers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import models.Group;
import models.User;
import utils.HibernateUtil;

public class DataManager {

	private static DataManager INSTANCE;
	private SessionFactory mSessionFactory = HibernateUtil.getSessionFactory();
	
	public static DataManager getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new DataManager();
		} 
		return INSTANCE;
	}
	
	public void createNewUser(User user) {
		
		if(user.getNickname() != null) {
			Session session = mSessionFactory.openSession();
			
			session.beginTransaction();
		    session.save(user);
		    session.getTransaction().commit();
		    mSessionFactory.close();
		}
	}
	
	public void createNewGroup(Group group) {
		Session session = mSessionFactory.openSession();
		
		session.beginTransaction();
	    session.save(group);
	    session.getTransaction().commit();
	    mSessionFactory.close();
	}
	
	
	
}
