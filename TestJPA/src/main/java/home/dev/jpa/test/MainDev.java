package home.dev.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class MainDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("TestJPA");
			EntityManager em=emf.createEntityManager();
			Device d1 = new Device("Wi-Fi adapter");
			
			em.getTransaction().begin();
			em.persist(d1);
			
			em.getTransaction().commit();
			em.close();
			emf.close();
			
	}

}
