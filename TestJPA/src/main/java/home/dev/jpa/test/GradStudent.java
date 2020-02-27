package home.dev.jpa.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "grad_student")
public class GradStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOK_DB_PK")
	@SequenceGenerator(name = "BOOK_DB_PK", sequenceName = "BOOK_DB_PK",allocationSize = 1)
	@Column(name="gstd_id")
	private int studentId;
	
	@Column(name="gstd_name")
	private String studentName;
	
	@ManyToOne
	@JoinColumn(name = "university_id")
	private University university;
	
	
	public GradStudent() {
		super();
	}

	public GradStudent(String studentName) {
		super();
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
}
