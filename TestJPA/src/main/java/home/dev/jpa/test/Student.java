package home.dev.jpa.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
@NamedQueries(
		{
			@NamedQuery(name="student.getAll", query="SELECT s FROM Student s"),
			@NamedQuery(name="student.getByStream", query="SELECT s from Student s where s.stream=:stream order by s.studentId")
		}
)
public class Student {
	@Id
	@Column(name="id")	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_seq")
	@SequenceGenerator(name="student_seq",sequenceName="student_seq",allocationSize = 1)
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="stream")
	private String stream;

	
	public Student() {}
	
	public Student(String studentName, String stream) {
		super();
		this.studentName = studentName;
		this.stream = stream;
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

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	public String toString() {
		return this.studentId+" "+this.studentName+" "+this.stream;
	}
}
