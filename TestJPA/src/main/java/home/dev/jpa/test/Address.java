package home.dev.jpa.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address{
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "ADDR_SEQ")
	@SequenceGenerator(name="ADDR_SEQ",sequenceName = "ADDR_SEQ")
	@Column(name = "ADDR_ID")
	private int addrId;
	
	@Column(name="ADDR_NAME")
	private String addrName;
	
	@OneToOne
	//@JoinColumn(name = "emp_id")
	@JoinColumn(name="emp_id")
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Address() {
		super();
	}


	public int getAddrId() {
		return addrId;
	}


	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}


	public String getAddrName() {
		return addrName;
	}


	public void setAddrName(String addrName) {
		this.addrName = addrName;
	}


	
}
