package home.dev.jpa.test;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
//import javax.persistence.TypedQuery;



public class MainClass {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestJPA");
		EntityManager em= emf.createEntityManager();
		//int i=5;
		//String stream="Transport";
		
		/*Student s = new Student("Clippity Clop 2","Transport");
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();*/
		
		/*
		em.getTransaction().begin();
		Student s= em.find(Student.class, 4);
		System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getStream());
		em.remove(s);
		em.getTransaction().commit();
		*/
		//Query query = em.createQuery("SELECT s FROM Student s where s.studentId="+i);
		/*TypedQuery<Student> query = em.createNamedQuery("student.getAll", Student.class);		
		List<Student>	result =  query.getResultList();				
		for(Student s : result) {
			System.out.println(s);
		}
		
		System.out.println("@Named");
		
		query= em.createNamedQuery("student.getByStream", Student.class);
		query.setParameter("stream", stream);
		result= query.getResultList();
		for(Student s : result) {
			System.out.println(s);
		}
		*/
		
		/*Employee employee=new Employee();
		Address address= new Address();
		
		employee.setEmpName("Elanor Williams");
		address.setAddrName("Providence.");
		
		employee.setAddress(address);
		address.setEmployee(employee);*/
		
		/*Book book=new Book();
		book.setBookName("Inferno");
		book.setProtagonistName("ROBERT LANGDON");
		em.getTransaction().begin();
		em.persist(book);*/
		/*em.persist(employee);
		em.persist(address);*/
		
		//em.getTransaction().commit();
		/*
		TypedQuery<Book> query = em.createNamedQuery("book.getAll",Book.class);
		List<Book> result= query.getResultList();
		for(Book b:result) {
			System.out.println(b);
		}
		*/
		/*	
		GradStudent gradStudent1= new GradStudent("Jimmy Cohen");
		GradStudent gradStudent2= new GradStudent("Natalia Jones");
		GradStudent gradStudent3= new GradStudent("Robert Stanforth");
		GradStudent gradStudent4= new GradStudent("Bethisda Foreman");
		
		University university1 =new University("UCLA");
		University university2 =new University("MIT");
		
		
		gradStudent1.setUniversity(university1);
		gradStudent2.setUniversity(university1);
		gradStudent3.setUniversity(university2);
		gradStudent4.setUniversity(university2);
		
		
		university1.addStudent(gradStudent1);
		university1.addStudent(gradStudent2);
		university2.addStudent(gradStudent3);
		university2.addStudent(gradStudent4);
		*/
		
		//em.getTransaction().begin();	
		
		/*
		em.persist(university1);
		em.persist(university2);
		
		em.persist(gradStudent1);
		em.persist(gradStudent2);
		em.persist(gradStudent3);
		em.persist(gradStudent4);
		*/
		
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
