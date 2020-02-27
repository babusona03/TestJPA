package home.dev.jpa.test;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="INSTRUCTOR")
public class Instructor {
	@Id
	@Column(name="INST_ID")
	@GeneratedValue
	private int instructorId;
	
	@Column(name = "INST_NAME")
	private String instructorName;
	
	@ManyToMany(mappedBy = "instructors")
	private List<Project> projects;
	
	public Instructor() {
		super();
		this.projects= new ArrayList<>();
	}
	public Instructor(String instructorName) {
		this();
		this.instructorName = instructorName;
	}
	
	public void addProject(Project project) {
		this.projects.add(project);		
	}
}
