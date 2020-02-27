package home.dev.jpa.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT")
public class Project {
	@Id
	@GeneratedValue
	@Column(name = "PRJ_ID")
	private int projectId;
	
	@Column(name = "PRJ_NAME")
	private String projectName;
	
	@ManyToMany
	@JoinTable(name = "INS_PRJ_XREF",
		joinColumns = @JoinColumn(name = "instructorId"),
		inverseJoinColumns = @JoinColumn (name ="projectId" )
	)
	private List<Instructor> instructors;
	
	public Project() {
		super();
		this.instructors=new ArrayList<>();
	}

	public Project(String projectName) {
		this();
		this.projectName = projectName;
	}		
	public void addInstructor(Instructor instructor) {
		this.instructors.add(instructor);
	}
}
