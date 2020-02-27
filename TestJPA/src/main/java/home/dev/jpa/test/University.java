package home.dev.jpa.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "university")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "BOOK_DB_PK")
	@SequenceGenerator(name="BOOK_DB_PK",sequenceName = "BOOK_DB_PK",allocationSize = 1)
	@Column(name = "university_id")
	private int universityId;
	
	@Column(name = "university_name")
	private String universityName;
	
	@OneToMany(mappedBy = "university")
	private List<GradStudent> studentList;
	
	public University() {
		this.studentList=new ArrayList<>();
	}

	public University(String universityName) {
		this();		
		this.universityName = universityName;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public int getUniversityId() {
		return universityId;
	}

	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}

	public List<GradStudent> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<GradStudent> studentList) {
		this.studentList = studentList;
	}
	public void addStudent(GradStudent student) {
		this.studentList.add(student);
	}
	
}
