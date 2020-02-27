package home.dev.jpa.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@PersistenceContext(unitName = "TestJPA")
public class ContactService {
	private EntityManagerFactory emf;
	private EntityManager em;
	
	
	public ContactService(){}
	
	public void createContact(ContactInformation contactInformation) {
		
		emf	=	Persistence.createEntityManagerFactory("TestJPA");
		em	=	emf.createEntityManager();
		//this.contactInformation = contactInformation;
		em.getTransaction().begin();
		em.persist(contactInformation);
		em.flush();
		em.getTransaction().commit();
		em.close();
		emf.close();		
	}
	
	public List<ContactInformation> readContact(){
		
		emf= Persistence.createEntityManagerFactory("TestJPA");
		em=emf.createEntityManager();
		TypedQuery<ContactInformation> query = em.createQuery("SELECT e FROM ContactInformation e",ContactInformation.class);
		List<ContactInformation> contactInformation= query.getResultList();
		return contactInformation;
	}
}
