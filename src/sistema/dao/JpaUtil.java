package sistema.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	public static EntityManager getEntityManager(){
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("sistema");
		return factory.createEntityManager();
		
	}
	
	

}
