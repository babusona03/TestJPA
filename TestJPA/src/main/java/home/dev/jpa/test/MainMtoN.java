package home.dev.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainMtoN {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestJPA");
		EntityManager em= emf.createEntityManager();		
		Project p1 =new Project("EJB");
		Project p2 =new Project("JSF");
		Project p3 =new Project("JSP");
		//Project p4 =new Project("REST");
		//Project p5 =new Project("JSON-B");
		//Project p6 =new Project("JPA");
		//Project p7 =new Project("JSP");
		
		Instructor i1= new Instructor("Soham Sengupta");
		Instructor i2= new Instructor("Martin Kallins");
		//Instructor i3= new Instructor("Balazs Holczer");
		
		i1.addProject(p1);
		i2.addProject(p2);
		i1.addProject(p3);
		
		p1.addInstructor(i1);
		p2.addInstructor(i2);
		p3.addInstructor(i1);
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(i1);
		em.persist(i2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
