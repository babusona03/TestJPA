package home.dev.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CONTACT_DB")
public class ContactInformation {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Contact_seq")
	@SequenceGenerator(name="Contact_seq",sequenceName="contact_seq", allocationSize=1)
	@Column(name="ID", updatable = false, nullable=false)	
	private long id;
	
	@Column(name="CONTACT_NAME")
	private String contactName;
	
	@Column(name="PHONE_NO")
	private String phoneNo;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContactName() {
		return contactName;
	}
	public void setName(String contactName) {
		this.contactName = contactName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}	
}
